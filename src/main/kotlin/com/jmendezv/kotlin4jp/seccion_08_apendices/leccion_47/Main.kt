package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_47

/*
* LECCION 47: SCOPE FUNCTIONS: let
*
* Se puede utilizar para encadenar llamadas.
*
* let se usa a menudo para ejecutar un bloque de código que contiene valores anulables.
*
* Para realizar acciones en un objeto no nulo, utilice el operador de llamada segura?
*
* */

fun processNonNullString(str: String) {}

fun main() {
   val numbers = mutableListOf("one", "two", "three", "four", "five")
   // Sin let
   val resultList = numbers.map { it.length }.filter { it > 3 }
   println(resultList)
   // Con let
   numbers.map { it.length }.filter { it > 3 }.let {
      println(it)
   }
   // Si la lambda de la función let contiene it como argumento,
   // entonces se puede simplificar usando el operador de referencia a método
   numbers.map { it.length }.filter { it > 3 }.let(::println)
   // let también se usa a menudo para ejecutar un bloque de código que contiene valores anulables
   val str: String? = "Hello"
   // processNonNullString(str)       // Posible error de ejecución, str puede ser null
   val length = str?.let {
      println("let() called on $it")
      processNonNullString(it)      // dentro de la expresión '?.let { }' estamos seguros que no es null
      it.length
   }
   // it se puede cambiar por un nombre de variable más significativo
   val modifiedFirstItem = numbers.first().let { firstItem ->
      println("The first item of the list is '$firstItem'")
      if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
   }.uppercase()
   println("First item after modifications: '$modifiedFirstItem'")
}