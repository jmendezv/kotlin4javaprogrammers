package com.jmendezv.kotlin4jp.seccion_06.leccion_29

fun main() {
    // Con un ArrayDeque podemos implemetar tanto una cola como una pila
    val cola: ArrayDeque<Int> = ArrayDeque(listOf(1, 2, 3, 4))
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