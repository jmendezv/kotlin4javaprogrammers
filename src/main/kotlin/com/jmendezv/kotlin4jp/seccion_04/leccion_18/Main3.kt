package com.jmendezv.kotlin4jp.seccion_04.leccion_18


/*
* Las declaraciones de clases no son las únicas que pueden tener tipos de datos como parámetros.
* Las funciones también.
* */

fun <T> buildBox(item: T): Box<T> {
    return Box<T>(item)
}

fun main() {
    val box = buildBox(Int.MAX_VALUE)
    println(box)
}