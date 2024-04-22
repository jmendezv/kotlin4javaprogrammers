package com.jmendezv.kotlin4jp.seccion_03.leccion_08

fun main() {
    // La función while ejecuta un bloque de instrucciones cero o más veces mientras se cumple una condición
    // expresada al inicio del bucle.
    var i = 0
    while (i < 10) {
        if (i > 5) break
        if (i < 3) {
            i++
            continue
        }
        println(i++)
    }
    // La función do también ejecuta un bloque de instrucciones mientras se cumple una condición
    // expresada al final del blucle. Como mínimo se ejecuta una vez.
    i = 0
    do {
        println(i++)
    } while(i < 5)
}