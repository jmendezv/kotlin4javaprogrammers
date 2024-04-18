package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_50

import kotlin.time.Duration
import kotlin.time.measureTime
import kotlin.time.measureTimedValue

fun main() {
    /**
    * Medida de la duración de procesos.
    * */
    val timeTaken1: Duration = measureTime {
        Thread.sleep(100)
    }
    println(timeTaken1.inWholeMilliseconds) // e.g. 103 ms
    /*
    * Medida de la duración de procesos y retorno de valor.
    * */
    val (value, timeTaken2) = measureTimedValue {
        Thread.sleep(100)
        42
    }
    println(value)     // 42
    println(timeTaken2.inWholeMilliseconds) // e.g. 103 ms
}