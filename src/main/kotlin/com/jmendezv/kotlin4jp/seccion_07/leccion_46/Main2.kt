package com.jmendezv.kotlin4jp.seccion_07.leccion_46

import kotlin.time.measureTime

/*
* LECCIÓN 46: UN EJEMPLO COMPLETO
*
* Este ejemplo suma las cantidades de dos fichero scuencialmente
* y calcula el saldo final.
*
* */


/*
* Versión secuencial
* */
fun main() {
    val elapsedTime = measureTime {
        println(calculaSaldo2())
    }
    println("Tiempo de ejecución $elapsedTime")
}

/*
*
* */
fun calculaSaldo2(): String {
    val sumaEntradas =
        try {
            calculaSuma(FILE_PATH_ENTRADAS)
        } catch (e: Exception) {
            0.0
        }
    val sumaSalidas =
        try {
            calculaSuma(FILE_PATH_SALIDAS)
        } catch (e: Exception) {
            0.0
        }
    val saldo = sumaEntradas - sumaSalidas
    return String.format("%+.2f€", saldo)
}
