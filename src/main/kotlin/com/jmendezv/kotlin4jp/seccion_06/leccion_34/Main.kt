package com.jmendezv.kotlin4jp.seccion_06.leccion_34

/*
* LECCION 34: LOS OPERADORES DE SOBRECARGA
*
* Todos los operadores se pueden adaptar a nuestras clases
* */

data class Punto(val x: Int = 0, val y: Int = 0)

infix operator fun Punto.plus(punto: Punto): Punto =
   Punto(this.x + punto.x, this.y + punto.y)

fun main() {
   val p1 = Punto(1, 1)
   val p2 = Punto(2, 3)
   // La función plus se puede usar de tres formas
   val p3 = p1.plus(p2)
   val p4 = p1 plus p2
   val p5 = p1 + p2
   println(p3)
   println(p4)
}