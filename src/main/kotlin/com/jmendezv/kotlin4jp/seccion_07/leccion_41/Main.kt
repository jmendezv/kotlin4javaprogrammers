package com.jmendezv.kotlin4jp.seccion_07.leccion_41

/*
* LECCIÓN 41: LAS CORUTINAS
*
* */

fun temperaturaPrevista() {
    println(Thread.currentThread().name)
    Thread.sleep(1000)
    println("Temperatura: 30º")
}

fun previsionMeteorologica() {
    println(Thread.currentThread().name)
    Thread.sleep(1000)
    println("Previsión: Soleado")
}

fun main() {
    println(Thread.currentThread().name)
    val instanteInicial = System.currentTimeMillis()
    previsionMeteorologica()
    temperaturaPrevista()
    val instanteFinal = System.currentTimeMillis()
    println("Duración ${instanteFinal - instanteInicial} ms.")
}