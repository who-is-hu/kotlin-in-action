package chap08

var funcOrNull: (() -> Unit)? = null

// java에선 FunctionN으로 바뀜

enum class OS { WINDOWS, ANDROID, IOS, MAC }
data class SiteVisit(val path: String, val os: OS, val duration: Double)

val log = listOf(
    SiteVisit("/hi", OS.IOS, 1.1),
    SiteVisit("/hello", OS.ANDROID, 2.3),
    SiteVisit("/hello", OS.MAC, 12.1),
    SiteVisit("/hello", OS.ANDROID, 4.9),
)

fun List<SiteVisit>.averageDuration(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()

fun main() {
    println(log.averageDuration { it.os == OS.ANDROID })
}