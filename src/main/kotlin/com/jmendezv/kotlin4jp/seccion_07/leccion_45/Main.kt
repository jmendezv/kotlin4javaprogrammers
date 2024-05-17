package com.jmendezv.kotlin4jp.seccion_07.leccion_45

import kotlinx.coroutines.*
import kotlin.time.measureTime

/*
* LECCIÓN 45: LA GESTIÓN DE EXCEPCIONES EN LAS CORRUTINAS
*
* */

fun main() {
   println("main() comienza")
   val elapsedTime = measureTime {
      runBlocking {
         println("Solicitando revisión del tiempo")
         try {
            println(prevision())
         } catch (e: AssertionError) {
            println("Excepción inesperada: $e")
            println("Vuelva más tarde")
         }
      }
   }
   println("Tiempo de ejecución $elapsedTime")
   println("main() acaba")
}

/*
* Un coroutineScope
* */
suspend fun prevision() = coroutineScope {
   val prevision: Deferred<String> = async(start = CoroutineStart.LAZY) {
      previsionMeteorologica()
   }
   val temperatura: Deferred<String> = async() {
      temperaturaPrevista()
   }
   "${prevision.await()} ${temperatura.await()}"
}

suspend fun temperaturaPrevista(): String {
   // delay() es una función suspend
   delay(1000)
   throw AssertionError("Temperatura no disponible")
   return ("Temperatura: 30\u00b0C")
}

suspend fun previsionMeteorologica(): String {
   delay(1500)
   return ("Previsión: Soleado")
}