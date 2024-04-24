package com.jmendezv.kotlin4jp.seccion_07.leccion_44

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.measureTime

/*
* LECCIÓN 44: ¿QUÉ ES UN JOB?
*
* */

fun main() {
    println("main() comienza")
    println("\tHilo actual ${Thread.currentThread().name}")
    val elapsedTime = measureTime {
        runBlocking {
            // dentro de un bloque runBlocking el código es secuencial
            println("Previsión del tiempo")
            val job1: Job = launch {
                previsionMeteorologica()
            }
            val job2: Job = launch {
                temperaturaPrevista()
            }
            println(job1.isActive)
            println(job1.isCompleted)
            println(job1.isCancelled)
            println(job2.isActive)
            println(job2.isCompleted)
            println(job2.isCancelled)
        }
    }
    println("Tiempo de ejecución $elapsedTime")
    println("main() acaba")
}

suspend fun temperaturaPrevista() {
    println("\tHilo actual ${Thread.currentThread().name}")
    // delay() es una función suspend
    delay(1000)
    println("Temperatura: 30\u00b0C")
}
suspend fun previsionMeteorologica() {
    println("\tHilo actual ${Thread.currentThread().name}")
    delay(1500)
    println("Previsión: Soleado")
}