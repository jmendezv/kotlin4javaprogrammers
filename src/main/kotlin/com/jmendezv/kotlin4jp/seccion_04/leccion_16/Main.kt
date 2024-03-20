package com.jmendezv.kotlin4jp.seccion_04.leccion_16

/*
* LECCION 16: DATA CLASS
*
* */

data class Estudiante(val id: Long, val nombre: String, var nota: Int) {
    val calificacion: String
        get() = when (nota) {
            in 0..4 -> "No supera"
            5 -> "Suficiente"
            6 -> "Bien"
            in 7..8 -> "Notable"
            9 -> "Excelente"
            10 -> "Matricula de Honopr"
            else -> "Error de nota"
        }
}


fun main() {
    val estudiante1 = Estudiante(1234567890, "Juan", 8)
    val estudiante2 = Estudiante(9876543210, "Anna", 9)
    println(estudiante1)
    println(estudiante1 == estudiante2)
    println(estudiante1.hashCode())
    println(estudiante2.hashCode())
    val estudiante3 = estudiante1.copy(id = 23456713450, nota = 7)
    println(estudiante3)
    // destructuring declaration utiliza las funciones componentN() por
    // orden, de izquierda a derecha
    val (id, nombre, nota) = estudiante3
    println("[$id - $nombre - $nota]")
}