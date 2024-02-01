package controllers

import models.Lampara

fun main() {
    val primeraLamapara=Lampara()
    primeraLamapara.settIdentificador("Baño")

    val segundaLampara=Lampara()
    primeraLamapara.settIdentificador("Habitación")

    primeraLamapara.encender()
    repeat(3){
        primeraLamapara.cambioColor()
    }
    primeraLamapara.cambioIntensidad()

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