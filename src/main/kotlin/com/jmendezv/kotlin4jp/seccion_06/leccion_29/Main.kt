package com.jmendezv.kotlin4jp.seccion_06.leccion_29

/*
* LECCIÓN 29: LAS COLECCIONES
*
* Hay dos tipos de colecciones: mutables (se pueden modificar) e inmutables (no se pueden modificar)
*
* */

fun main() {
    val listaMutable = mutableListOf(1, 2, 3, 4, 5)
    listaMutable.add(6)
    println(listaMutable)
    // lista = mutableListOf(2, 4, 6, 8) // Error, val no puede ser reasignado
    val listaInmutable = listOf(1, 2, 3, 4)
    // listaInmutable.add(6) // Error, no se puede modificar el contenido!
    println(listaInmutable)
}