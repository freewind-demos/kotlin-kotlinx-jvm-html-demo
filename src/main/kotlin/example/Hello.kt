package example

import kotlinx.html.*
import kotlinx.html.stream.appendHTML
import java.io.StringWriter

fun main(args: Array<String>) {
    val page = StringWriter()
    page.appendHTML().html {
        body {
            div {
                +"Hello"
            }
        }
    }
    println(page.toString())
}
