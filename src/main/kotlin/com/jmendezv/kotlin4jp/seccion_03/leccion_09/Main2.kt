package com.jmendezv.kotlin4jp.seccion_03.leccion_09

import kotlin.math.pow

typealias Peso = Double

/*
* Indice de Masa Corporal que se define como peso/(altura * altura)
*
* Una función de tipo infix debe ser una función miembro, o una función de extensión
* como aquí, y tiene que tener un único parámetro sin valor por defecto
* */
infix fun Peso.imc(altura: Double) = this / altura.pow(2)

fun main() {
    println(79.35.imc(1.8))
    // Invocación de la función imc() con notación infija
}