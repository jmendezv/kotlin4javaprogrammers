package com.jmendezv.kotlin4jp.seccion_06.leccion_39

/*
 * A veces puede ser interesante envolver un tipo concreto en un clase para crear un tipo de dominio más específico.
 *
 * El problema radica en que introduce cierta sobrecarga en tiempo de ejecución. Incluso peor si se trata de un tipo
 * primitivo, ya que los tipos primitivos están altamente optimizados por el compilador, pero no así las clases
 * envolventes o wrappers.
 *
 * La solución a este dilema está en las value class etiquetadas como @JmvInline, que no tienen identidad y solamente
 * sirven para contener valores.
 *
 * Una inline value class debe tener exactamente un parámetro.
 */
interface Offuscate {
   fun encode(): String
}

@JvmInline
value class Password(private val s: String) : Offuscate {

   constructor(s: String, d: String) : this("$d$s$d")

   val lenght: Int
      get() = s.length

   init {
      require(s.isNotEmpty()) {
         "Proporciona una clave"
      }
   }

   override fun encode(): String = s.reversed()

}

fun main() {
   val pass: Password = Password("Secret")
   println(pass.encode())
}