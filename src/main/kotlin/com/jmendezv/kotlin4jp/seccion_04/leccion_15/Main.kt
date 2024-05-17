package com.jmendezv.kotlin4jp.seccion_04.leccion_15

/*
* LECCIÓN 15: LAS PROPIEDADES Y MÉTODOS DE EXTENSIÓN
*
* */

// par() es una función de extensión de la clase Int
fun Int.par() = this % 2 == 0

// En este contexto 'this' se refiere al entero que invoca la función
fun Int.impar() = (this % 2 == 1).also { println(this) }

// Las funciones de extensión pueden tener parámetros.
fun Int.entre(a: Int, b: Int): Boolean = this in a..b

// primoYPar es una propiedad de tipo boolean de la clase Int
val Int.primoYPar: Boolean
   get() = this == 2

fun main() {
   println(3.impar())
   println(6.par())
   println(5.entre(0, 10))
   for (i in 1..5)
      if (i.primoYPar)
         break
      else println(i)
}