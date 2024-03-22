package com.jmendezv.kotlin4jp.seccion_04.leccion_23

/*
*
* Lazy delegate
* */

val holaMundo: String by lazy(LazyThreadSafetyMode.NONE) {
    println("Soy una variable lazy")
    "Hola Mundo."
}

fun main() {
    println(holaMundo)
    println(holaMundo)
    println(holaMundo)
}