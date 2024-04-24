package com.jmendezv.kotlin4jp.seccion_07.leccion_45

import kotlinx.coroutines.*
import kotlin.time.measureTime

fun main() {
    println("main() comienza")
    val elapsedTime = measureTime {
        runBlocking {
            println("Solicitando revisión del tiempo")
            println(prevision2())
        }
    }
    println("Tiempo de ejecución $elapsedTime")
    println("main() acaba")
}

/*
* Un coroutineScope
* */
suspend fun prevision2() = coroutineScope {
    val prevision: Deferred<String> = async(start = CoroutineStart.LAZY) {
        previsionMeteorologica2()
    }
    val temperatura: Deferred<String> = async() {
        try {
            temperaturaPrevista2()
        } catch (e: AssertionError) {
            // println("Error inesperado $e")
            "Temperatura: 'No disponible'"
        }

    }
    "${prevision.await()} ${temperatura.await()}"
}

suspend fun temperaturaPrevista2(): String {
    // delay() es una función suspend
    delay(1000)
    throw AssertionError("Temperatura no disponible")
    return ("Temperatura: 30\u00b0C")
}

suspend fun previsionMeteorologica2(): String {
    delay(1500)
    return ("Previsión: Soleado")
}