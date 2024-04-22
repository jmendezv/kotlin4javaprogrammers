package com.jmendezv.kotlin4jp.seccion_03.leccion_09

/*
* LECCION 09: LAS FUNCIONES
*
* La declaración de los parámetros sigue la notación Pascal (nombre: Tipo) y se separan por comas.
*
* */

fun f() {}

fun g(): Unit {}

// Sintaxis 'tradicional'
fun doble_v1(value: Int): Int {
    return value * 2
}

// Sintaxis 'abreviada' y valor por defecto
fun doble_v2(value: Int = 0): Int = value * 2

// Sintaxis 'abreviada' con tipo de retorno inferido por el compilador
fun doble_v3(value: Int = 0) = value * 2


fun main() {
    println(doble_v1(2))
    println(doble_v2())
    // Paso de argumentos por nombre
    println(doble_v3(value = 3))
}