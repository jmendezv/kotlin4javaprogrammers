package com.jmendezv.kotlin4jp.seccion_06.leccion_28

/*
* LECCIÓN 28: DECLARACIONES DESESTRUCTURADAS
*
* */

data class PC(val marca: String, val modelo: String, var precio: Double)

fun main() {
    // Diferentes ejemplos de desestructuración
    // data class
    val pc = PC("IBM", "AS-400", 145_900.09)
    val (marca, modelo, precio) = pc
    println("$marca $modelo $precio€")
    // Pair
    val par = Pair("casa", "house")
    val (esp, ing) = par
    println("$esp $ing")
    // mapa o diccionario
    val mapa = mapOf(1 to "Enero", 2 to "Febrero", 3 to "Marzo")
    mapa.mapValues { (clave, valor) ->
        println("$clave $valor")
    }


}