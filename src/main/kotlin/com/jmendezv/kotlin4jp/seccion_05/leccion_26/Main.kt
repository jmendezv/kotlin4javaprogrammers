package com.jmendezv.kotlin4jp.seccion_05.leccion_26

/*
* LECCIÓN 26: INLINE FUNCTIONS
*
* */

inline fun <T> saluda(body: () -> T): T = body()

fun main() {
   println(saluda {
      "Hola Mundo."
   })
}