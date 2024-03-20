package com.jmendezv.kotlin4jp.seccion_04.leccion_18

/*
* LECCION 18: LOS GENERICOS
*
* */

class Box<T>(var item: T)

fun main() {
    // Instanciación formal
    var box1: Box<Int> = Box<Int>(1)
    // En la declaración queda claro el tipo de Box
    var box2: Box<Int> = Box(1)
    // El compilador infiere el tipo de Box por el argumento
    var box3 = Box(1)
    var box: Box<Number> = Box(1)
    // Type mismatch
    // box = box1
}