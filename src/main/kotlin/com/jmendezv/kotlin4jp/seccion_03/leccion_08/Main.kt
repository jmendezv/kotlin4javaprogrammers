package com.jmendezv.kotlin4jp.seccion_03.leccion_08

import com.jmendezv.kotlin4jp.seccion_03.leccion_08.datos.DatosIterables
import com.jmendezv.kotlin4jp.seccion_03.leccion_08.datos.MasDatosIterables

/*
* LECCIÓN 08: EL CONTROL FLOW
*
* */
fun main() {
    val a = 1
    val b = 2
    // la función if() puede usarse como expresión, en este caso la rama else es obligatoria
    var max = if (a > b) a else b
    println("el máximo de $a y $b es $max")
    // cada rama de una estructura if puede ser un bloque en este caso la rama else es opcional
    if (a == b) {
        println("a y b son iguales")
    } else {
        println("a y b no son iguales")
    }
    // La función when utiliza múltiples ramas y también se puede usar como expresión
    // La rama else es obligatoria si no se cubren todos los casos
    val nota = 9
    val calificación = when (nota) {
        !is Int -> "La nota es un numero entero"
        !in 0..10 -> "Nota es un número entre 0 y 10"
        in 0..4 -> "En proceso de mejora"
        5 -> "Sufi"
        6 -> "Bien"
        in 7..8 -> "Notable"
        9 -> "Excelente"
        10 -> "Matricula de honor"
        else -> "Error de calificación"
    }
    // La función for() puede iterar por cualquier objeto que tenga un iterator
    for (i in 1..10) println(i)
    for (i in 1 until 10 step 2) println(i)
    for (i in 10 downTo 1 step 3) println(i)
    val coleccion = listOf("Alfa", "Bravo", "Charlie")
    for (item in coleccion) println(item)
    val array = intArrayOf(1, 2, 3)
    for (i in array.indices) println("i = $i array[i] = ${array[i]}")
    for ((i, v) in array.withIndex()) println("i = $i v = $v")
    for (i in DatosIterables(10, 20, 30)) println(i)
    for (i in MasDatosIterables(10, 20, 30, 40, 50)) println(i)
    var i = 0
    while (i < 10) {
        if (i > 5) break
        if (i < 3) {
            i++
            continue
        }
        println(i++)
    }
    i = 0
    do {
        println(i++)
    } while(i < 5)
}