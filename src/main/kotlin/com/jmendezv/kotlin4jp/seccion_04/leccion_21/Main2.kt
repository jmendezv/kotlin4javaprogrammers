package com.jmendezv.kotlin4jp.seccion_04.leccion_21

/*
* LECCION 21: LAS EXPRESIONES Y DECLARACIONES DE TIPO OBJECT
*
* */


/*
* Un data object sigue el patrón Singleton. Todas las instancias comparten sus propiedades
* */
data object Portatil {
   val marca: String = "IBM"
   val modelo: String = "DEEP BLUE"
   var precio: Double = 1_234_980.34
}

fun main() {
   val portatil1 = Portatil
   println(portatil1)
   val portatil2 = Portatil
   // portatil1 y portatil2 apuntan al mismo objeto
   println(portatil1 == portatil2) // true
   portatil1.precio = 0.0
   println(portatil2.precio)
   println(portatil1.hashCode())
   println(portatil2.hashCode())
}