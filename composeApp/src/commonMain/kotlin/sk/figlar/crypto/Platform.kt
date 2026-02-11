package sk.figlar.crypto

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform