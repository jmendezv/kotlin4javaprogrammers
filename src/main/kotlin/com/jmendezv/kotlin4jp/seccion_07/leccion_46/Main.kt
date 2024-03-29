package com.jmendezv.kotlin4jp.seccion_07.leccion_46

import kotlinx.coroutines.*
import java.io.BufferedReader
import java.io.File
import kotlin.time.measureTime

/*
* LECCIÓN 46: UN EJEMPLO COMPLETO
*
* Este ejemplo suma las cantidades de dos fichero asincronamente
* y calcula el saldo final.
*
*
* */

const val FILE_PATH_ENTRADAS: String = "entradas.txt"
const val FILE_PATH_SALIDAS: String = "salidas.txt"
fun main() {
    val elapsedTime = measureTime {
        runBlocking {
            println(
                calculaSaldo(
                    FILE_PATH_ENTRADAS,
                    FILE_PATH_SALIDAS
                )
            )
        }
    }
    println("Tiempo de ejecución $elapsedTime")
}

/*
* Un coroutineScope
* */
suspend fun calculaSaldo(entradas: String, salidas: String) = coroutineScope {
    val sumaEntradas: Deferred<Double> = async(start = CoroutineStart.LAZY) {
        try {
            calculaEntradas(entradas)
        } catch (e: Exception) {
            0.0
        }

    }
    val sumaSalidas: Deferred<Double> = async(start = CoroutineStart.LAZY) {
        try {
            calculaSalidas(salidas)
        } catch (e: Exception) {
            0.0
        }

    }
    val totalEntradas = sumaEntradas.await()
    val totalSalidas = sumaSalidas.await()
    val saldo = totalEntradas - totalSalidas
    String.format("%+.2f€", saldo)
}

fun calculaEntradas(entradas: String): Double {

    val entradasBR: BufferedReader = File(entradas).bufferedReader()
    var suma = 0.0
    entradasBR.forEachLine {
        suma += it.toDouble()
    }

    return suma
}

fun calculaSalidas(salidas: String): Double {

    val salidasBR: BufferedReader = File(salidas).bufferedReader()
    var suma = 0.0
    salidasBR.forEachLine {
        suma += it.toDouble()
    }
    return suma
}