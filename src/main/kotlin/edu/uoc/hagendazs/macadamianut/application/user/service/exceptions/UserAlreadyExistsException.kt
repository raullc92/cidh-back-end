package edu.uoc.hagendazs.macadamianut.application.user.service.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(HttpStatus.CONFLICT)
class UserAlreadyExistsException(
    message: String
): RuntimeException(message)