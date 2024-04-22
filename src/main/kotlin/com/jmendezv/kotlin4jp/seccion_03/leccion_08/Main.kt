package com.jmendezv.kotlin4jp.seccion_03.leccion_08

/*
* LECCIÓN 08: EL CONTROL FLOW
*
* */

/*
* Si bien las instrucciones se ejecutan secuencialmente, los lenguajes de programación proporcionam
* instrucctiones para ejecutar bloques de códogo de forma condicional y para ejecutar bloques de
* código repetidas veces.
* */
fun main() {
    val a = 1
    val b = 2
    // Cuando la función if() se usa como expresión (retornando un valor), la rama else es obligatoria.
    var max = if (a > b) a else b
    println("el máximo de $a y $b es $max")
}