package com.jmendezv.kotlin4jp.seccion_07.leccion_42

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.measureTime

/*
* LECCIÓN 42: LAS FUNCIONES RUNBLOCKING() Y LA INTERFAZ COROUTINESCOPE
*
* La función runBlocking() se usa sólo a efectos de testing, no debe usarse
* en producción. Crea un contexto de Coroutine que permite ejecutar otras
* primitivas.
*
* La mala noticia es que runBlcoking es síncrono y dentro de un bloque
* runBlocking las llamadas son secuenciales! Como ves en este fragmento de
* código, el tiempo transcurrido es la suma de los dos retardos aproximadamente.
*
* */

fun main() {
    println("main() comienza")
    println("\tHilo actual ${Thread.currentThread().name}")
    val elapsedTime = measureTime {
        runBlocking {
            // dentro de un bloque runBlocking el código es secuencial
            println("Previsión del tiempo")
            previsionMeteorologica()
            temperaturaPrevista()
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