package com.jmendezv.kotlin4jp.seccion_03.leccion_08

import com.jmendezv.kotlin4jp.seccion_03.leccion_08.datos.DatosIterables
import com.jmendezv.kotlin4jp.seccion_03.leccion_08.datos.MasDatosIterables

fun main() {
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
}