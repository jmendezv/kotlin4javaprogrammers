package com.jmendezv.kotlin4jp.seccion_04.leccion_14

/*
* LECCION 14: LOS MODIFICADORES DE VISIBILIDAD
*
* */

open class A(
    // public es el modificador de visibilidad por defecto
    public val a: Int = 1,
    private val b: Int = 2,
    // Visible aquí y en las subclases de esta clase
    protected val c: Int = 3,
) {
    init {
        println("A.init")
        println(a)
        println(b)
        println(c)
    }
}

/*
* La clase B es una subclase de A, por tanto, hereda sus propiedades
* no privadas
* */
class B : A(10, 20,30 ) {
    init {
        println("B.init")
        println(a)
        // println(b) // Error b es privado
        println(c)
    }
}


fun main() {
    val b = B()
    println(b.a)
    // println(b.b) // Error
    // println(b.c) // Error
}