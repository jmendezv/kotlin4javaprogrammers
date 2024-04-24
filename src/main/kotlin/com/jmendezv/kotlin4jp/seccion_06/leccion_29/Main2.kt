package com.jmendezv.kotlin4jp.seccion_06.leccion_29

fun main() {
    // Los conjuntos no contiene duplicados
    val conjuntoMutable = mutableSetOf(1, 2, 3, 3, 4, 5)
    conjuntoMutable.add(6)
    println(conjuntoMutable)
    val conjuntoInmutable = setOf(1, 2, 3, 4, 4)
    println(conjuntoInmutable)
    val mapaMutable = mutableMapOf(1 to "ALFA", 2 to "BETA")
    mapaMutable.put(3, "DELTA")
    mapaMutable[2] = "BRAVO"
    println(mapaMutable)
    val mapaInmutable = mapOf(1 to "ALFA", 2 to "BETA")
    println(mapaInmutable)
}