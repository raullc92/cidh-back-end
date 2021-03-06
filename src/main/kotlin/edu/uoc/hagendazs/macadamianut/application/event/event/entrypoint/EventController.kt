package edu.uoc.hagendazs.macadamianut.application.event.event.entrypoint

import edu.uoc.hagendazs.macadamianut.application.event.event.entrypoint.input.NewOrUpdateEventRequest
import edu.uoc.hagendazs.macadamianut.application.event.event.entrypoint.output.EventResponse
import edu.uoc.hagendazs.macadamianut.application.event.event.service.EventService
import edu.uoc.hagendazs.macadamianut.application.event.label.service.LabelService
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

@Controller
@RequestMapping("/api/v1")
class EventController {

    @Autowired
    private lateinit var eventService: EventService

    @Autowired
    private lateinit var labelService: LabelService

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping(value = ["/events"])
    fun createEvent(
        @RequestBody newEventReq: NewOrUpdateEventRequest,
        request: HttpServletRequest,
    ): ResponseEntity<EventResponse> {
        val createdEvent = eventService.createEvent(newEventReq) ?: run {
            throw ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Unable to create event!")
        }
        val eventUriString = request.requestURL.toString().plus("/${createdEvent.id}")
        val eventUri = URI.create(eventUriString)
        return ResponseEntity.created(eventUri).body(createdEvent)
    }

    @PostMapping(value = ["/events/{eventId}"])
    fun updateEvent(
        @RequestBody newEventReq: NewOrUpdateEventRequest,
        @PathVariable("eventId") eventId: String,
        jwtToken: Authentication?,
    ): ResponseEntity<EventResponse> {
        eventService.findById(eventId, null) ?: run {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Event with id $eventId not found in this server")
        }
        val updatedEvent = eventService.updateEvent(
            eventId,
            newEventReq,
            jwtToken?.name
        ) ?: run {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "Unable to update event!")
        }
        return ResponseEntity.ok(updatedEvent)
    }

    @GetMapping(value = ["/events/{eventId}"])
    fun getEventById(
        @PathVariable("eventId") eventId: String,
        jwtToken: Authentication?,
    ): ResponseEntity<EventResponse> {
        val event = eventService.findById(eventId, jwtToken?.name) ?: run {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, "Entity with id $eventId not found in this server")
        }
        return ResponseEntity.ok(event)
    }

    @GetMapping(value = ["/events"])
    fun getEventsByFilter(
        @RequestParam(required = false) label: Collection<String>?,
        @RequestParam(required = false) category: Collection<String>?,
        @RequestParam(required = false) name: Collection<String>?,
        @RequestParam(required = false) admin: Collection<String>?,
        @RequestParam(required = false) limit: Int?,
        jwtToken: Authentication?,
    ): ResponseEntity<Collection<EventResponse>> {
        val eventCollection = eventService.findEventsWithFilters(
            requesterUserId = jwtToken?.name,
            labels = label ?: emptyList(),
            categories = category  ?: emptyList(),
            names = name  ?: emptyList(),
            admins = admin ?: emptyList(),
            limit = limit,
        )

        return ResponseEntity.ok(eventCollection)
    }
}
