package com.jmendezv.kotlin4jp.seccion_04.leccion_15

/*
* LECCIÓN 15: LAS PROPIEDADES Y MÉTODOS DE EXTENSIÓN
*
*
* */
fun Int.par() = this % 2 == 0

fun Int.impar() = (this % 2 == 1).also { println(this) }

// Las funciones miembro pueden tener parámetros
fun Int.entre(a: Int, b: Int): Boolean = this in a..b

val Int.primoYPar: Boolean
    get() = this == 2

fun main() {
    println(3.impar())
    println(6.par())
    println(5.entre(0, 10))
}