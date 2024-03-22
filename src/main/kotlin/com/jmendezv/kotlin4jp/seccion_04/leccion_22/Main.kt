package com.jmendezv.kotlin4jp.seccion_04.leccion_22

/*
* LECCION 22: DELEGACIÓM DE CÓDIGO
*
* */

interface Base {
    fun calc(): Int
}

class BaseSquareImpl(private val n: Int) : Base {
    override fun calc(): Int = n * n
}

class BaseMaxImpl(private val m: Int, private val n: Int) : Base {
    override fun calc(): Int = if (m > n) m else n

}

class Derived(base: Base) : Base by base

fun main() {
    val squareImpl = BaseSquareImpl(3)
    val cubeImpl = BaseMaxImpl(4, -9)
    println(Derived(squareImpl).calc())
    println(Derived(cubeImpl).calc())
}