package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_47

/*
* LECCION 47: SCOPE FUNCTIONS: with
*
* Dado que with no es una función de extensión: el objeto de contexto se pasa como argumento, pero dentro de la lambda,
* está disponible como receptor (this).
*
* Recomendamos usar with para llamar funciones en el objeto de contexto cuando no necesite usar el resultado devuelto.
*
* En el código, with puede leerse como "con este objeto, haz lo siguiente".
*
* */

fun main() {
   val numbers = mutableListOf("one", "two", "three")
   // Usaremos with para agrupar acciones sobre el mismo objeto
   with(numbers) {
      println("'with' is called with argument $this")
      println("It contains $size elements")
   }
   // El valor de retorno de la función with es la última expresión lambda
   val firstAndLast = with(numbers) {
      "The first element is ${first()}," +
           " the last element is ${last()}"
   }
   println(firstAndLast)
}