package controllers

import models.Lampara

fun main() {
    val primeraLampara=Lampara()
    primeraLampara.settIdentificador("Baño")

    val segundaLampara=Lampara()
    primeraLampara.settIdentificador("Habitación")

    primeraLampara.encender()
    repeat(3){
        primeraLampara.cambioColor()
    }
    primeraLampara.cambioIntensidad()

    segundaLampara.encender()
    repeat(2){
        segundaLampara.cambioColor()
    }
    segundaLampara.cambioIntensidad()
    segundaLampara.apagar()
    segundaLampara.cambioColor()
    segundaLampara.encender()
    segundaLampara.cambioColor()
    segundaLampara.cambioIntensidad()
}