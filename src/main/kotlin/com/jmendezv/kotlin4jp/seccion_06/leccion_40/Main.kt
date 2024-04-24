package com.jmendezv.kotlin4jp.seccion_06.leccion_40

/*
* LECCION 40: LAS SECUENCIAS Sequence<T>
* Una secuencia puede ser finita o infinita
* */

fun main() {
    val secuenciaDeNumeros1 = sequenceOf("uno", "dos", "tres")
    val listaDeNumeros = listOf("uno", "dos", "tres")
    val secuenciaDeNumeros2 = listaDeNumeros.asSequence()
    // Secuencia infinita
    val numerosPares = generateSequence(2) { it + 2 }
    println(numerosPares.take(5).toList())
    // Secuencia finita
    val numerosParesMenoresDe10 = generateSequence(2) {
        if (it < 8) it + 2 else null
    }
    println(numerosParesMenoresDe10.count())
    val secuencia = sequence<Int> {
        yield(0)
        yieldAll(listOf(1, 2, 3))
        // secuencia infinita
        yieldAll(generateSequence(4) { it + 1 })
    }
    println(secuencia
        .take(10)
        .filter {
            it % 2 == 0
        }
        .map {
            it * it
        }
        .toList())
}