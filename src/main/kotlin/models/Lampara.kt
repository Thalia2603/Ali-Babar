package models

import utilities.*

class Lampara {
    private var color:String="Blanco"
    private var intensidad:Int=0
    private var encendida:Boolean=false
    private var identificador:String?=null
    private var listaColores= listOf<String>("Azul","Amarillo","Violeta","Blanco","Negro","Rojo")


   fun settIdentificador(identificadorActualizado:String){
       identificador=identificadorActualizado
   }
    fun encender(){
        encendida=true
        estadoLampara()
    }

    fun apagar(){
        encendida=false
        estadoLampara()
    }
    fun cambioIntensidad(){
        intensidad= readIntRange("Introduce la intensidad de la lámpara: " , 1,5)
        estadoLampara()
    }

    fun cambioColor(){
        when(val colorUsuario= readWord("Introduce el color de la lámpara","Introduce un color correcto")){
            "blanco" -> "${WHITE_BOLD}$colorUsuario${RESET}"
            "negro" -> "${BLACK_BOLD}$colorUsuario${RESET}"
            "azul" -> "${BLUE_BOLD}$colorUsuario${RESET}"
            "rojo" -> "${RED_BOLD}$colorUsuario${RESET}"
            "amarillo" -> "${YELLOW_BOLD}$colorUsuario${RESET}"
            "violeta" -> "${PURPLE_BOLD}$colorUsuario${RESET}"
            in listaColores -> colorUsuario
            else ->{
                println("${RED_BOLD_BRIGHT  } ERROR: el color no aparece en la lista. Se introducirá el color básico: Blanco ${RESET}")
            }
        }
        estadoLampara()
    }
    fun estadoLampara(){
        val estadoLamapara= if (encendida){"${YELLOW_BACKGROUND} LÁMPARA ENCENDIDA"}else "${RED_BACKGROUND} LÁMPARA APAGADA"
        val asciiLampara=if(encendida) dibujoAsciiEncendido() else  dibujoAsciiApagado()
        println("Identificador: $identificador Estado: $estadoLamapara, Color: $color, Intensidad: $intensidad ")
        println(asciiLampara)
    }
}
