package com.jmendezv.kotlin4jp.seccion_03.leccion_10

import java.rmi.UnexpectedException
import kotlin.random.Random
import kotlin.random.nextInt


/*
* LECCIÓN 10: RETURN TYPES
*
* */

fun f(): Unit = println("")

fun g(): Any = throw UnexpectedException("Algo pasó")

fun randomInt(): Int = Random.nextInt()

fun h() {}

fun main() {

}