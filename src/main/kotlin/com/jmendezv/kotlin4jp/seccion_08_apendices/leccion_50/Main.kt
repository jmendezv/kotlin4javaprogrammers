package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_50

import kotlin.time.Duration
import kotlin.time.Duration.Companion.days
import kotlin.time.Duration.Companion.milliseconds
import kotlin.time.Duration.Companion.minutes
import kotlin.time.Duration.Companion.nanoseconds
import kotlin.time.Duration.Companion.seconds

/*
* LECCION 50: MEDICIÓN DEL TIEMPO
*
* */

fun main() {
   /*
   * Para crear un objeto Duration, usamos las propiedades de extensión
   * */
   val fiveHundredMilliseconds: Duration = 500.milliseconds
   val zeroSeconds: Duration = 0.seconds
   val tenMinutes: Duration = 10.minutes
   val negativeNanosecond: Duration = (-1).nanoseconds
   val infiniteDays: Duration = Double.POSITIVE_INFINITY.days
   val negativeInfiniteDays: Duration = Double.NEGATIVE_INFINITY.days

   println(fiveHundredMilliseconds) // 500ms
   println(zeroSeconds)             // 0s
   println(tenMinutes)              // 10m
   println(negativeNanosecond)      // -1ns
   println(infiniteDays)            // Infinity
   println(negativeInfiniteDays)    // -Infinity
}