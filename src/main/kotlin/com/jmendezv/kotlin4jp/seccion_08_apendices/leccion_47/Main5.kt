package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_47

/*
* LECCION 47: SCOPE FUNCTIONS: also
*
* es útil para realizar algunas acciones que toman el objeto de contexto como argumento.
* Úselo también para acciones que necesitan una referencia al objeto en lugar de sus propiedades y funciones,
* o cuando no desea ocultar la referencia this desde un ámbito externo.
*
* Cuando vea también en el código, puede leerlo como "y también hacer lo siguiente con el objeto".
*
* */

fun main() {
   val numbers = mutableListOf("one", "two", "three")
   numbers
      .also { println("The list elements before adding new one: $it") }
      .add("four")
}