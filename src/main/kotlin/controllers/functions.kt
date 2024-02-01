package controllers

import utilities.RED_BOLD
import utilities.RESET
import utilities.YELLOW_BOLD

fun dibujoAsciiEncendido(){
    return println("$YELLOW_BOLD      _\n" +
            "     | |\n" +
            "    (o o)\n" +
            "    |._.|\n" +
            "    / | \\\n" +
            "   / / \\ \\\n $RESET")
}

fun dibujoAsciiApagado(){
    return println("$RED_BOLD      _\n" +
            "     | |\n" +
            "    (x x)\n" +
            "     |^|\n" +
            "    / | \\\n" +
            "   / / \\ \\\n $RESET")
}