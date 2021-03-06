package edu.uoc.hagendazs.macadamianut.common

class HTTPMessages() {
    companion object {
        const val USER_NOT_FOUND = "User not found"
        const val CREATED = "The resource was created successfully"
        const val MISSING_VALUES = "Some fields doesn't have value"
        const val ALREADY_EXISTS = "This resource already exists"
        const val NOT_FOUND = "This resource not exists"
        const val ERROR_SAVING_A_RESOURCE = "Error saving resource"
        const val UNABLE_TO_CREATE = "Unable to create resource"
        const val FORBIDDEN_USER_ADMIN_ACCESS = "Provided user role does not allow this action"
        const val UNABLE_TO_DELETE = "Unable to delete resource"
    }
}
