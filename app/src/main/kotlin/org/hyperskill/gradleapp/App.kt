package org.hyperskill.gradleapp

import com.diogonunes.jcdp.color.ColoredPrinter
import com.diogonunes.jcdp.color.api.Ansi

class App {
    val greeting: String
        get() {
            return "Hello Colorful World!"
        }
}

fun main() {
    val printer = ColoredPrinter.Builder(1, false).build()

    printer.print(App().greeting,
        Ansi.Attribute.BOLD, Ansi.FColor.GREEN, Ansi.BColor.BLACK)
}
