package com.jmendezv.kotlin4jp.leccion_08.datos

const val LIMITE = 3

class DatosIterables(val a: Int, val b: Int, val c: Int) : Iterator<Int> {

    var index: Int = 0
    override fun hasNext(): Boolean = index < LIMITE

    override fun next(): Int = when(index++) {
        0 -> a
        1 -> b
        2 -> c
        else -> throw IllegalArgumentException()
    }
}

class MasDatosIterables(vararg val items: Int) : Iterable<Int> {

    var index = 0
    override fun iterator(): Iterator<Int> = object : Iterator<Int> {
        override fun hasNext(): Boolean = index < items.size
        override fun next(): Int = items[index++]
    }

}