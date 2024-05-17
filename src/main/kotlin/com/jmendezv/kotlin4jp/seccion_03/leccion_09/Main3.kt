package com.jmendezv.kotlin4jp.seccion_03.leccion_09

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

/*
* Aproximació de PI = 3.14159264498239
*
* Sumatorio de 1 + 1/2^2 + 1/3^2 + ... + 1/n^2
*
* */
fun aproximaPi(): Double {
   var MIPI = 0.0
   for (i in 1..Int.MAX_VALUE) {
      MIPI += 1 / (i.toDouble().pow(2.0))
   }
   return sqrt(6 * MIPI)
}

/*
* Las funciones con el modificador tailrec permite al compilador optimizar las recursividad,
* traduciendo la versión en una versión iterativa
*
* 3.1415926531451195
*
* Aproximación a PI según Eulier mediante recursividad de cola
*
* */
tailrec fun aproximaPiRec(
   acum: Double = 0.0,
   iter: Int = Int.MAX_VALUE
): Double = if (iter == 0)
   sqrt(6 * acum)
else
   aproximaPiRec(acum + 1.0 / iter.toDouble().pow(2), iter - 1)


fun main() {
   println(aproximaPi())
   println(aproximaPiRec())
   println(PI)
}