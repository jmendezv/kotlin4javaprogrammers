package com.jmendezv.kotlin4jp.seccion_04.leccion_18

// Kotlin <out T>, Java <? super T>
interface Productor<out T> {
    fun get(): T
}

// Kotlin <in T>, Java <? extends T>
interface Consumidor<in T> {
    fun delete(t: T): Unit
}

fun main() {

    val productorString = object : Productor<String> {
        override fun get(): String = "Whatever"
    }
    val consumidorString = object : Consumidor<String> {
        override fun delete(t: String) {}
    }
    var productorAny: Productor<Any> = productorString

    // Comparable es un ejemplo de contravariante
    val x: Comparable<Number> = object : Comparable<Number> {
        override fun compareTo(other: Number): Int = 0
    }
    // Comparable es un consumidor
    val y: Comparable<Double>
    // Comparable<Double> = Comparable<Number>
    y = x
}