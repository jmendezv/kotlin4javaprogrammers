package com.jmendezv.kotlin4jp.seccion_07.leccion_46

import kotlinx.coroutines.*
import java.io.BufferedReader
import java.io.File
import kotlin.time.measureTime

/*
* LECCIÓN 46: UN EJEMPLO COMPLETO
*
* Este ejemplo suma las cantidades de dos fichero asincronamente y calcula el saldo final.
*
* */

const val FILE_PATH_ENTRADAS: String = "entradas.txt"
const val FILE_PATH_SALIDAS: String = "salidas.txt"

/*
* Versión concurrente
* */
fun main() {
   val elapsedTime = measureTime {
      runBlocking {
         println(calculaSaldo())
      }
   }
   println("Tiempo de ejecución $elapsedTime")
}

/*
* Un coroutineScope
* */
suspend fun calculaSaldo() = coroutineScope {
   val sumaEntradas: Deferred<Double> = async(start = CoroutineStart.LAZY) {
      try {
         calculaSuma(FILE_PATH_ENTRADAS)
      } catch (e: Exception) {
         0.0
      }

   }
   val sumaSalidas: Deferred<Double> = async(start = CoroutineStart.LAZY) {
      try {
         calculaSuma(FILE_PATH_SALIDAS)
      } catch (e: Exception) {
         0.0
      }

   }
   val totalEntradas = sumaEntradas.await()
   val totalSalidas = sumaSalidas.await()
   val saldo = totalEntradas - totalSalidas
   String.format("%+.2f€", saldo)
}

fun calculaSuma(fichero: String): Double {

   val ficheroReader: BufferedReader = File(fichero).bufferedReader()
   var suma = 0.0
   ficheroReader.forEachLine {
      suma += it.toDouble()
   }

   return suma
}
