package com.jmendezv.kotlin4jp.seccion_02.leccion_04

/*
* LECCIÓN 04: LOS IDIOMS
*
* */
fun miFuncion(): Any = TODO("Pendiente")

fun main() {
    var a = 1
    var b = 2
    // Intercambio de dos variables sin variable temporal
    a = b.also { b = a }
    // String template $variable o ${expresión}
    println("a = $a b = $b")
    // definición de un rango
    val r = 1..10
    println(r)
    // Comprobación de si un elemento pertenece al rango
    println(0 in r)
}