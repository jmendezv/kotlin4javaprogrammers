package com.jmendezv.kotlin4jp.seccion_03.leccion_10

/*
* Retorno no local. Se llama no local porque sale de la función demo1() y no sólo de la función forEach()
* */
fun demo1() {
   listOf(1, 2, 3, 4, 5).forEach { valor ->
      if (valor == 3) return
      println(valor)
   }
   println("A este punto no llega nunca.")
}

fun main() {
   println("demo1()")
   demo1()
}