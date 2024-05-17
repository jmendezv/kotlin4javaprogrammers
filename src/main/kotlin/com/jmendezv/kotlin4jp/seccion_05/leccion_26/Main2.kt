package com.jmendezv.kotlin4jp.seccion_05.leccion_26

import kotlin.math.pow

infix fun Double.elevado(expo: Double): Double = this.pow(expo)

fun main() {
   println(2.0.elevado(3.0))
   println(2.0 elevado 3.0)
}