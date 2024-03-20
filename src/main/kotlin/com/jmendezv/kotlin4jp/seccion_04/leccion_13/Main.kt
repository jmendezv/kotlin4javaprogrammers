package com.jmendezv.kotlin4jp.seccion_04.leccion_13

/*
* LECCION 13: CLASES ENUM, CLASES ABSTRACTAS E INTERFACES
*
* */
enum class Direccion {
    DERECHA, IZQUIERDA,
}

enum class Energia {
    GASOLINA, GASOIL, HIBRIDO, ELECTRICO, GAS
}

abstract class Vehiculo(val matricula: String) {
    abstract var motor: Motor
    abstract fun arranca()
    abstract fun gira(direccion: Direccion, grados: Double)
    abstract fun endereza()
    abstract fun frena(intensidad: Double, duracion: Int)
    fun verificaMatricula() = true
}

interface Motor {
    val marca: String
    val cc: Int
    val energia: Energia
}

fun main() {
    // Las clases abstractar no se pueden instanciar directamente
//    val vehiculo = Vehiculo("5403KJK")
}