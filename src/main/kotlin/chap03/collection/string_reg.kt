package chap03.collection

fun main() {
    // split
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

    val path = "/Users/Yole/Kotlin-book/chapter.adoc"
    parsePath(path)
    parsePathWithRegex(path)

    val kotlinLogo = """| //
                       .|//
                       .|/\""".trimMargin(".")
    println(kotlinLogo)
}

fun parsePath(path: String){
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir : $directory, $fileName, $extension")
}

fun parsePathWithRegex(path: String){
    val regex = """(.+)/(.+)\.(.+)""".toRegex() // 3중 따옴표 문자열에서는 이스케이프 필요없음
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir : $directory, $filename, $extension")
    }
}