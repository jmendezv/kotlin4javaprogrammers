package com.jmendezv.kotlin4jp.seccion_03.leccion_08.datos

const val LIMITE = 3

/*
* La interfaz Iterator tiene dos métodos: next() que retorna el siguiente elemento y
* hasNext() que retorna true/false si quedan o no elementos por iterar.
* */
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

/*
* La interfaz Iterable tiene un único método, iterator() que retorna un objeto Iterator.
* vararg expresa una lista variable de parámetros normalmente pasados como argumentos individuales.
* En este caso Kotlin trata 'items' como una lista con propiedades como 'size' y accesible meidante
* un índice.
* */
class MasDatosIterables(vararg val items: Int) : Iterable<Int> {

    private var index = 0
    override fun iterator(): Iterator<Int> = object : Iterator<Int> {
        override fun hasNext(): Boolean = index < items.size
        override fun next(): Int = items[index++]
    }

}