package com.jmendezv.kotlin4jp.seccion_06.leccion_32

/*
* LECCION 32: LA EXPRESIÓN 'THIS' Y 'SUPER'
*
* En general, 'this' se refiere a la instancia actual y 'super' a la super clase
*
* */

// En este contexto 'this' se refiere al objeto actual, por ejemplo m

data class Mamifero(val especie: String, var edad: Int) {
   // En este contexto, super.toString() invoca el método toString() de la superclase
   override fun toString(): String = super.toString() + " ${this.especie} ${this.edad}"
}

// En este caso 'this' se refiere a la instancia actual
fun Mamifero.esAdulto() = this.edad > 8

fun main() {
   val m = Mamifero("Simio", 3)
   println(m)
   println(m.esAdulto())
}