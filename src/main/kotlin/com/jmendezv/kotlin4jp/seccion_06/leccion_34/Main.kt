package com.jmendezv.kotlin4jp.seccion_06.leccion_34

/*
* LECCION 34: LOS OPERADORES DE SOBRECARGA
*
* https://kotlinlang.org/docs/operator-overloading.html
*
* */

data class Punto(val X: Int = 0, val Y: Int = 0)

operator fun Punto.plus(punto: Punto): Punto =
    Punto(this.X + punto.X, this.Y + punto.Y)

fun main() {
    val p1 = Punto(1, 1)
    val p2 = Punto(2, 3)
    // La función plus se puede usar de dos formas
    val p3 = p1.plus(p2)
    val p4 = p1 + p2
    println(p3)
    println(p4)
}