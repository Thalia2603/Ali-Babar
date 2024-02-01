package controllers

import models.Lampara

/**
 * Funcion main: contiene las ejecuciones del programa donde se realiza lo siguiente:
 * en primer lugar con la primeraLampara, se enciende, se cambia de color 3 veces y se le modifica la intensidad
 * en segundo lugar con la segundaLamapra, se enciende, se cambia de color dos veces, se modifica la intensidad, se apaga, se cambia otra vez el color
 * se enciende, se cambia el color una vez mas y por último se modifica la intensidad
 * @author Thalia Bravo
 * @since 01/02/2024
 */
fun main() {
    val primeraLampara=Lampara()
    primeraLampara.settIdentificador("Baño")

    val segundaLampara=Lampara()
    segundaLampara.settIdentificador("Habitación")

   /* primeraLampara.encender()
    repeat(3){
        primeraLampara.cambioColor()
    }
    primeraLampara.cambioIntensidad()*/

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