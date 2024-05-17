package com.jmendezv.kotlin4jp.seccion_06.leccion_36

/*
* LECCIÓN 36: LAS EXCEPCIONES
*
* */

// Podemos crear nuestras propias excepciones aunque no es recomendable
class AlgoFueMalException(override val message: String) : Throwable(message)

fun upps(msg: String): Nothing = throw IllegalArgumentException(msg)

fun main() {
   // x tiene como tipo Nothing?
   val x: Nothing? = null
   // l tiene como tipo List<Nothing?>
   val l: List<Nothing?> = listOf(null)
   try {
      upps("uhmmmmm")
   } catch (e: IllegalArgumentException) {
      println(e.message)
   } finally {
      println("En finally")
   }
}