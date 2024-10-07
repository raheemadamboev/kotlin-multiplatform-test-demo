package xyz.teamgravity.kotlinmultiplatformtestdemo

fun getInitials(value: String): String {
    return value.split(" ")
        .filter { it.isNotBlank() }
        .joinToString(
            separator = ""
        ) { it.first().uppercase() }
}