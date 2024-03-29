package com.jmendezv.kotlin4jp.seccion_07.leccion_43

import kotlinx.coroutines.*
import kotlin.time.measureTime

fun main() {
    println("main() comienza")
    println("\tHilo actual ${Thread.currentThread().name}")
    val elapsedTime = measureTime {
        runBlocking {
            // dentro de un bloque runBlocking el código es secuencial
            println("Previsión del tiempo")
            val prevision: Deferred<String> = async {
                previsionMeteorologica2()
            }
            val temperatura: Deferred<String> = async {
                temperaturaPrevista2()
            }
            println("Esperando resultados:")
            println("${prevision.await()} ${temperatura.await()}")
        }
    }
    println("Tiempo de ejecución $elapsedTime")
    println("main() acaba")
}

suspend fun temperaturaPrevista2(): String {
    println("\tHilo actual ${Thread.currentThread().name}")
    // delay() es una función suspend
    delay(1000)
    return ("Temperatura: 30\u00b0C")
}
suspend fun previsionMeteorologica2(): String {
    println("\tHilo actual ${Thread.currentThread().name}")
    delay(1500)
    return ("Previsión: Soleado")
}