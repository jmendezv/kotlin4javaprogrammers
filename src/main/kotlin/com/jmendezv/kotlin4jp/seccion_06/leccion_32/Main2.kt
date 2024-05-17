package com.jmendezv.kotlin4jp.seccion_06.leccion_32

/*
* Este ejemplo extraido de la documentación oficial de Kotlin ilustra el uso de 'this' etiquetado
*
* */
class A { // implicit label @A
   inner class B { // implicit label @B
      fun Int.foo() { // implicit label @foo
         val a = this@A // A's this
         val b = this@B // B's this

         val c = this // foo()'s receiver, an Int
         val c1 = this@foo // foo()'s receiver, an Int

         val funLit = lambda@ fun String.() {
            val d = this // funLit's receiver, a String
         }

         val funLit2 = { s: String ->
            // foo()'s receiver, since enclosing lambda expression
            // doesn't have any receiver
            val d1 = this
         }
      }
   }
}

fun main() {

}