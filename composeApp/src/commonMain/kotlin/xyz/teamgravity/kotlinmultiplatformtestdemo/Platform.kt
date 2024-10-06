package xyz.teamgravity.kotlinmultiplatformtestdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform