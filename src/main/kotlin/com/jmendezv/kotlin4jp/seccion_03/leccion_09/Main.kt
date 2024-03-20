package com.jmendezv.kotlin4jp.seccion_03.leccion_09

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

typealias Peso = Double

/*
* La declaración de los parámetros sigue la notación Pascal (nombre: Tipo)
* y se separan por comas
* */
/*fun double(value: Int = 0): Int {
    return value * 2
}*/

//fun double(value: Int = 0): Int = value * 2

fun double(value: Int = 0) = value * 2

/*
* Indice de Masa Corporal que se define como peso/(altura * altura)
*
* Una función de tipo infix debe ser una función miembro, o una función de extensión
* como aquí, y tiene que tener un único parámetro sin valor por defecto
* */
infix fun Peso.imc(altura: Double) = this / altura.pow(2)

/*
* 3.14159264498239
*
* */
fun aproximaPi(): Double {
    var MIPI = 0.0
    for (i in 1..Int.MAX_VALUE) {
        MIPI += 1 / (i.toDouble().pow(2.0))
    }
    return sqrt(6 * MIPI)
}

/*
* Las funciones con el modificador tailrec permite al compilador optimizar las recursividad,
* traduciendo la versión en una versión iterativa
*
* 3.1415926531451195
*
* Aproximación a PI según Eulier
* */
tailrec fun aproximaPiRec(
    acum: Double = 0.0,
    iter: Int = Int.MAX_VALUE
): Double = if (iter == 0)
    sqrt(6 * acum)
else
    aproximaPiRec(acum + 1.0 / iter.toDouble().pow(2), iter - 1)


fun main() {
    println(double())
    println(double(2))
    println(double(value = 3))
    // Aquí llamo a la función imc() como una función de extensión del tipo Double
    println(79.35.imc(1.8))
    // Aquí llamo a la función imc() con notación infija
    println(79.35 imc 1.8)
    println(aproximaPi())
    println(aproximaPiRec())
    println(PI)
}