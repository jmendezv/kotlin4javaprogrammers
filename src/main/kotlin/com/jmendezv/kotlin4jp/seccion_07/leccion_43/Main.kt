package com.jmendezv.kotlin4jp.seccion_07.leccion_43

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.measureTime

/*
* LECCIÓN 43: LA FUNCIÓN LAUCH() vs ASYNC()
*
* */

fun main() {
    println("main() comienza")
    println("\tHilo actual ${Thread.currentThread().name}")
    val elapsedTime = measureTime {
        runBlocking {
            // dentro de un bloque runBlocking el código es secuencial
            println("Previsión del tiempo")
            launch {
                previsionMeteorologica()
            }
            launch {
                temperaturaPrevista()
            }
        }
    }
    println("Tiempo de ejecución $elapsedTime")
    println("main() acaba")
}

suspend fun temperaturaPrevista(): Unit {
    println("\tHilo actual ${Thread.currentThread().name}")
    // delay() es una función suspend
    delay(1000)
    println("Temperatura: 30\u00b0C")
}

suspend fun previsionMeteorologica(): Unit {
    println("\tHilo actual ${Thread.currentThread().name}")
    delay(1500)
    println("Previsión: Soleado")
}