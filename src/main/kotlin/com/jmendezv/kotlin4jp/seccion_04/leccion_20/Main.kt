package com.jmendezv.kotlin4jp.seccion_04.leccion_20

/*
* LECCION 20: CLASES ENUMERADAS
*
* Una clase enumerada puede implementar una interfaz pero no puede derivar de una clase.
* La enum class implementa la interfaz Comparable por defecto.
*
* */

enum class DiasLaborables {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

fun main() {
    for (dia in DiasLaborables.entries)
        print("${dia.ordinal}-${dia.name} ")
    println()
    println(DiasLaborables.valueOf("LUNES"))
    println(DiasLaborables.LUNES.name)
    println(DiasLaborables.LUNES.ordinal)
    println(DiasLaborables.LUNES < DiasLaborables.MARTES)
    // println(DiasLaborables.valueOf("L U N E S")) // Error: No enum constant
}