package com.jmendezv.kotlin4jp.seccion_06.leccion_29

/*
* LECCIÓN 29: LAS COLECCIONES
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
    // Los conjuntos no contiene duplicados
    val conjuntoMutable = mutableSetOf(1,2,3,3,4,5)
    conjuntoMutable.add(6)
    println(conjuntoMutable)
    val conjuntoInmutable = setOf(1,2,3,4,4)
    println(conjuntoInmutable)
    val mapaMutable = mutableMapOf(1 to "ALFA", 2 to "BETA")
    mapaMutable.put(3, "DELTA")
    mapaMutable[2] = "BRAVO"
    println(mapaMutable)
    val mapaInmutable = mapOf(1 to "ALFA", 2 to "BETA")
    println(mapaInmutable)
    // Con un ArrayDeque podemos implemetar tanto una cola como una pila
    val cola: ArrayDeque<Int> = ArrayDeque(listOf(1,2,3,4))
    cola.addFirst(0)
    cola.addLast(5)
    println(cola)
    println(cola.first())
    println(cola.last())
    println(cola)
    cola.removeFirst()
    cola.removeLast()
    println(cola)
}