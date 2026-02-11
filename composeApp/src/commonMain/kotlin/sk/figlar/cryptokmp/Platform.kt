package sk.figlar.cryptokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform