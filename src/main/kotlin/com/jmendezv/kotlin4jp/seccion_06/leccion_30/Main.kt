package com.jmendezv.kotlin4jp.seccion_06.leccion_30

/*
*
* LECCIÓN 30: LOS RANGOS Y LAS PROGRESIONES
* */

fun main() {

    // Rango cerrado [1..5]
    println(5 in 1..5)
    // Rango abierto [1..5)
    println(5 in 1..<5)
    // Ejemplos de rangos
    val r1 = 1..9
    val r2 = 1..<9 step 2
    val r3 = 9 downTo 0
    val r4 = 9 downTo 0 step 3
    // Progresiones
    for (i in 1..10 step 3) print(i)
    // La función filter() retorna una lista
    println((1..10).filter { it % 2 == 0 })

}