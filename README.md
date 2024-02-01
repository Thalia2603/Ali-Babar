## Lámpara de Alí Babar
Programa que simula el funcionamiento básico de una lámpara: encender/apagar y modificar el color/intensidad
### Diagrama UML
![diagramaUml](https://github.com/Thalia2603/L-mpara/assets/153110473/9a481453-4db5-429f-ab95-2aeb08e1062a)

Sintaxi del diagrama UML: 
```kotlin
        -@startuml "Lampara"
    class Lampara {
        --ATRIBUTOS--
        - color: String
        - intensidad: Int
        - encendida: Boolean
        - identificador: String
        - listaColores: List<String>
        --MÉTODOS--
        + settIdentificador(identificadorActualizado: String)
        + encender()
        + apagar()
        + cambioIntensidad()
        + cambioColor()
        + estadoLampara()
    }
    @enduml
