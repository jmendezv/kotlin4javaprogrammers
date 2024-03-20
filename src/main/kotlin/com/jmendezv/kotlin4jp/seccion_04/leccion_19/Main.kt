package com.jmendezv.kotlin4jp.seccion_04.leccion_19

/*
* LECCIÓN 19: CLASES ANIDADAS E INTERNAS
*
* */

class Externa {
    private val x: Int = 1
    class Interna {
        fun f() = 2 // = x error
    }
}

// Todas la combinaciones entre clases e interfaces son posibles a cualquier nivel
interface IExterno {
    interface IInterno {
        class CInterna
    }
}

// La inner class tiene una referencia a la clase que la contiene

class Exterior {
    private val x: Int = 1
    inner class Interior {
        fun f() = x
    }
}

interface Driver {
    fun connect()
}

fun main() {
    val demo1 = Externa.Interna().f()
    println(demo1)
    val demo2 = Exterior().Interior().f()
    println(demo2)
    // Anonymous inner class implementation
    val driver = object : Driver {
        override fun connect() {
            println("Connecting")
        }
    }
    driver.connect()
}