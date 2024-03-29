package com.jmendezv.kotlin4jp.seccion_06.leccion_33

/*
* LECCIÓN 33: ¿CUÁNDO DOS OBJETOS SON IGUALES?
*
* */

data class CuentaCorriente(val titular: String, var saldo: Double)

fun main() {
    val cc1 = CuentaCorriente("Juan", 1000.0)
    val cc2 = CuentaCorriente("Juan", 1000.0)
    val cc3 = cc2
    println(cc1 == cc2)
    println(cc1 == cc3)
    println(cc1 === cc2)
    println(cc2 === cc3)
    println(cc1.hashCode())
    println(cc2.hashCode())
    println(cc3.hashCode())
}