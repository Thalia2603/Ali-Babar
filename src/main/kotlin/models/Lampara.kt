package models

import controllers.dibujoAsciiApagado
import controllers.dibujoAsciiEncendido
import utilities.*

/**
 * Clase que representa una lámpara, con sus propiedades y métodos correspondientes
 * @property color Color actual de la lámpara.
 * @property intensidad Intensidad actual de la lámpara.
 * @property encendida Indica si la lámpara está encendida o apagada.
 * @property identificador Identificador único de la lámpara.
 * @property listaColores Lista de colores permitidos para la lámpara.
 * @author Thalia Bravo
 * @since 01/02/2024
 */
class Lampara {
    private var color:String="Blanco"
    private var intensidad:Int=0
    private var encendida:Boolean=false
    private var identificador:String?=null
    private var listaColores= listOf<String>("Azul","Amarillo","Violeta","Blanco","Negro","Rojo")

    /**
     * Setter de la clase Lampara, este recibe un identificador actualizado según donde este posicionada la lámpara ( cocina,baño,comedor...)
     * @param identificadorActualizado, representa la actualización del identificador de la lámpara
     * @author Thalia Bravo
     */
   fun settIdentificador(identificadorActualizado:String){
       identificador=identificadorActualizado
   }

    /**
     * Método de la clase Lámpara, modifica la propiedad encendida: lámpara encendida (true)
     * @author Thalia Bravo
     */
    fun encender(){
        encendida=true
        estadoLampara()
    }

    /**
     * Método de la clase Lámpara, modifica la propiedad encendida: lámpara apagada (false)
     * @author Thalia Bravo
     */
    fun apagar(){
        encendida=false
        estadoLampara()
    }

    /**
     * Método de la clase Lámpara, cambia la intensidad de la lámpara solicitando la entrada del usuario
     * @author Thalia Bravo
     */
    fun cambioIntensidad(){
        intensidad= readIntRange("Introduce la intensidad de la lámpara: " , 1,5)
        estadoLampara()
    }

    /**
     * Método de la clase Lámpara, cambia el color de la lámpara solicitando la entrada del usuario
     * @author Thalia Bravo
     */
    fun cambioColor() {
        color = when (val colorUsuario = readWord("Introduce el color de la lámpara", "Introduce un color correcto")) {
            "blanco" -> "${WHITE_BOLD}$colorUsuario${RESET}"
            "negro" -> "${BLACK_BOLD}$colorUsuario${RESET}"
            "azul" -> "${BLUE_BOLD}$colorUsuario${RESET}"
            "rojo" -> "${RED_BOLD}$colorUsuario${RESET}"
            "amarillo" -> "${YELLOW_BOLD}$colorUsuario${RESET}"
            "violeta" -> "${PURPLE_BOLD}$colorUsuario${RESET}"
            in listaColores -> colorUsuario
            else -> {
                println("${RED_BOLD_BRIGHT} ERROR: el color no aparece en la lista. Se introducirá el color básico: Blanco ${RESET}")
                "Blanco"
            }
        }
        estadoLampara()
    }

    /**
     * Método de la clase Lámpara, muestra el estado actual de la lámpara, incluyendo identificador, estado (encendida o apagada), color e intensidad
     * @author Thalia Bravo
     */
    fun estadoLampara(){
        val estadoLamapara= if (encendida){"Encendida"}else "Apagada"
        val asciiLampara=if(encendida) dibujoAsciiEncendido() else  dibujoAsciiApagado()
        println("Identificador -> $identificador \nEstado -> $estadoLamapara \nColor -> $color \nIntensidad -> $intensidad ")
    }
}
