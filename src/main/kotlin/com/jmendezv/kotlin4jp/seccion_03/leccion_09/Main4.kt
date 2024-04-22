package com.jmendezv.kotlin4jp.seccion_03.leccion_09

/*
* Las funciones de más alto orden las veremos en un capítulo aparte.
* Se trata de funciones que reciben como argumento otra función o que retornan una función
* como valor de retorno.
*
* */

fun higherOrderFunction(f: () -> Unit): Unit = f()

fun sayHi() = println("Hola mundo.")
fun main() {
    higherOrderFunction(fun() = println("Hola Mundo."))
    higherOrderFunction(::sayHi)
    higherOrderFunction { println("Hola Mundo.") }
}