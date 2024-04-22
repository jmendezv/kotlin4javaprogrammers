package com.jmendezv.kotlin4jp.seccion_04.leccion_24

/*
* LECCION 24: HERENCIA
*
* */

/*
* En Kotlin las clases son finales por defecto.
* */
open class Base(id: Int) {
    init {
        println("Inicializando la clase Base")
    }
}

class Derivada(id: Int) : Base(id) {
    init {
        println("Inicializando la clase Derivada")
    }
}

/*
* Como vemos en este ejemplo la clase Base se inicializa antes que la Derivada
* */
fun main() {
    val d = Derivada(1)
}