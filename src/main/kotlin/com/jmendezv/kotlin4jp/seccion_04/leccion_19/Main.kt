package com.jmendezv.kotlin4jp.seccion_04.leccion_19

/*
* LECCIÓN 19: CLASES ANIDADAS E INTERNAS
*
* */

class Externa {
    private val x: Int = 1
    class Interna {
        fun f() = 2 // = x // Error, una clase interna no tiene acceso a los miembros de la clase externa
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
        fun f() = x // OK, una interior (inner class) sí que tiene acceso a los miembros de la clases exterior
    }
}

fun main() {
    // La clase Interna es un miembro más de la clase Externa
    val demo1 = Externa.Interna().f()
    println(demo1)
    // La clase Interior requiere una referencia a la clase Exterior, por eso se invoca el constructor
    val demo2 = Exterior().Interior().f()
    println(demo2)
}