package edu.uoc.hagendazs.macadamianut.application.user.entrypoint

import edu.uoc.hagendazs.macadamianut.application.user.entrypoint.input.UserPasswordReq
import edu.uoc.hagendazs.macadamianut.application.user.entrypoint.input.UserUpdateReq
import edu.uoc.hagendazs.macadamianut.application.user.model.dataClass.MNUser
import edu.uoc.hagendazs.macadamianut.application.user.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException
import java.net.URI
import javax.servlet.http.HttpServletRequest
import javax.validation.Valid

@Controller
class UserController {

    @Autowired
    lateinit var userService: UserService

    @PostMapping(value = ["users"])
    fun createUser(
        @RequestBody newUserReq: UserPasswordReq,
        request: HttpServletRequest
    ): ResponseEntity<MNUser> {
        val user = userService.createUser(
            email = newUserReq.email,
            plainTextPassword = newUserReq.password,
        )
        user ?: run {
            throw throw ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Unable to create user with given payload: $newUserReq"
            )
        }
        val userUriString = request.requestURL.toString().plus("/${user.id}")
        val personUri = URI.create(userUriString)
        return ResponseEntity.created(personUri).body(user)
    }

    // ############# LIST ALL USERS #############
    @PreAuthorize("hasAnyRole('ADMIN', 'SUPERADMIN')")
    @RequestMapping(value = ["users"], method = [(RequestMethod.GET)])
    fun getAllUsers(): ResponseEntity<Collection<MNUser>> {
        val persons = userService.findAll()
        return ResponseEntity.ok(persons)
    }

    // ############# GET SINGLE USER #############
    @PreAuthorize("#personId == authentication.principal.claims['username'] or hasAnyRole('ADMIN', 'DENTIST') or #personId == null")
    @GetMapping(value = ["users/{userId}", "users/me"])
    fun getUser(
        @PathVariable("userId") personId: String?,
        jwtToken: Authentication
    ): ResponseEntity<MNUser> {
        val resolvedPersonId = resolvePersonId(personId, jwtToken)
        val person = userService.findUserById(resolvedPersonId)
        return ResponseEntity.ok(person)
    }

    // ############# UPDATE USER #############
    @PreAuthorize("#userId == authentication.principal.claims['username'] or hasAnyRole('ADMIN', 'DENTIST') or #userId == null")
    @PostMapping(value = ["users/{userId}", "users/me"])
    fun updateUser(
        @PathVariable("userId") userId: String?,
        @RequestBody @Valid personData: UserUpdateReq,
        jwtToken: Authentication
    ): ResponseEntity<MNUser> {
        validateUpdateUserAuthorization(userId, personData, jwtToken.name)
        val resolvedPersonId = resolvePersonId(userId, jwtToken)
        val updatedPerson = userService.updatePerson(resolvedPersonId, personData)
        return ResponseEntity.ok(updatedPerson)
    }

    companion object {
        fun resolvePersonId(personId: String?, token: Authentication?): String {
            return personId ?: token?.name ?: run {
                throw ResponseStatusException(HttpStatus.UNAUTHORIZED)
            }
        }

        /**
         * Checks the requested user id in the payload is consistent with the POST payload.
         * 1 - If the requested user id in the query param to be updated matches with the jwt id -> OK
         * 2 - If the userId in the query param is "me", check that the payload matches with JWT token
         * Throw otherwise
         */
        private fun validateUpdateUserAuthorization(
            personId: String?,
            updateRequest: UserUpdateReq,
            jwtTokenPersonId: String?,
        ) {
            val requestedTargetPersonId = personId ?: jwtTokenPersonId ?: kotlin.run {
                throw ResponseStatusException(HttpStatus.UNAUTHORIZED)
            }
            if (updateRequest.id == null || requestedTargetPersonId == updateRequest.id) {
                return
            }
            var userMeMessage = ""
            if (personId == null) {
                userMeMessage = "(using the 'me' userId alias)"
            }
            throw ResponseStatusException(
                HttpStatus.BAD_REQUEST,
                "Url userId '$requestedTargetPersonId' $userMeMessage does not match " +
                        "with the payload user id: '${updateRequest.id}'"
            )
        }
    }

}