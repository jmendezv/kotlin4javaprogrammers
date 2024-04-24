package com.jmendezv.kotlin4jp.seccion_06.leccion_39

/*
* LECCIÓN 39: TYPE ALIASES
*
* */

typealias Predicado<T> = (T) -> Boolean
data class Clave(val id: Long)
data class Valor(val msg: String)

typealias Mapa = Map<Clave, Valor>
class A {
    inner class Interna
}
class B {
    inner class Interna
}

typealias AInner = A.Interna
typealias BInner = B.Interna

fun main() {
    val noNegativo: Predicado<Int> = { it >= 0}
    println(listOf(-2, -1, 0, 1, 2).filter(noNegativo))
    val mapa: Mapa = mapOf(
        Clave(1L) to Valor("Alfa"),
        Clave(2L) to Valor("Bravo"),
        )
    println(mapa)
}