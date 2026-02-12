package sk.figlar.cryptokmp.common

enum class ApiError : Error {
    NETWORK_ERROR,
    TIMEOUT,
    UNAUTHORIZED,
    NOT_FOUND,
    SERVER_ERROR,
    HTTP_ERROR,
    VALIDATION_ERROR,
    INVALID_REQUEST,
    UNKNOWN;

    // For UI display
    override fun toString(): String {
        return name.replace('_', ' ').lowercase().replaceFirstChar { it.uppercase() }
    }
}