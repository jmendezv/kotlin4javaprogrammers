package com.jmendezv.kotlin4jp.seccion_04.leccion_24

/*
* open class: puede ser heredada
* La palabra reserada 'constructor' es opcional y no necesita heredar
* de Any explícitamente porque ya lo hace implícitamente.
* */
open class Inicial constructor(open val id: Int) : Any() {
    init {
        println("En clase Inicial")
    }
}

/*
* Clase derivada con constructor primario inicializa la clase base
* llamando a su constructor directamente.
*
* */
open class DerivadaConConstructorPrimario
constructor(final override var id: Int = 0) :
    Inicial(id) {
    init {
        println("En clase DerivadaConConstructorPrimario")
    }
}

/*
* Una clase derivada sin constructor primario inicializa la clase base
* desde sus constructores secundarios mediante la palabra reservada
* 'super'. Un constructor secundario también puede llamar a
* otro constructor secundário que a su vez invoca el constructor
* de la clase base mediante 'super' como en este ejemplo.
*
* */
class DerivadaSinConstructorPrimario : Inicial {

    init {
        println("En clase DerivadaSinConstructorPrimario")
    }

    constructor(id: Int) : super(id)
    constructor() : this(-1)
}


fun main() {
    DerivadaConConstructorPrimario()
    DerivadaSinConstructorPrimario()
}