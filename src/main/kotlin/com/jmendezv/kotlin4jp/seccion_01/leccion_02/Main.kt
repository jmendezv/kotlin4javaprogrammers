package com.jmendezv.kotlin4jp.seccion_01.leccion_02

/*
* LECCIÓN 02: ¿PORQUÉ ESTE CURSO?
*
* */

data class Estudiante(val nombre: String)

/*
* Kotlin es conciso y fácil de aprender
* */
fun main() {
    // No existe el operador 'new'
    val e1 = Estudiante("Juan")
    // No es necesario escribir 'System.out.println()'
    println(e1)
    // se implementan automáticamente métodos como equals(), toString() y hashCode() entre otros
    println(e1.hashCode())
}