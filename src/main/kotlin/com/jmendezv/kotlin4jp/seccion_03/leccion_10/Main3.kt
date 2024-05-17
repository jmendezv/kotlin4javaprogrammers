package com.jmendezv.kotlin4jp.seccion_03.leccion_10

/*
* Retorno local, sale de la función forEach() mediante una etiqueta explícita
* */

fun demo2() {
   listOf(1, 2, 3, 4, 5).forEach etiqueta@{ valor ->
      if (valor == 3) return@etiqueta // Sale del bucle no de la función
      println(valor)
   }
   println("A este punto sí que llega")
}

fun main() {
   println("demo2()")
   demo2()
}