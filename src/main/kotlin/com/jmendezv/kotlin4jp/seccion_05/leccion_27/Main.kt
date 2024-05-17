package com.jmendezv.kotlin4jp.seccion_05.leccion_27

/*
* LECCIÓN 27: LAS EXPRESIONES LAMBDA
*
* */

// Esto es una expresión lambda
val sum1: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

// Esto es la misma expresión lambda omitiendo el tipo de la variable
val sum2 = { x: Int, y: Int -> x + y }

fun main() {
   println(sum1(1, 2))
   println(sum2(1, 2))
}