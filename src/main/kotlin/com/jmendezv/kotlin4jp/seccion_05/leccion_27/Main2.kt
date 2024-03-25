package com.jmendezv.kotlin4jp.seccion_05.leccion_27

/*
* La función de extensión fold() tiene dos parámetros, un valor inicial
* y una función que debe pasarse como argumento fuera de los paréntesis.
* */
fun main() {
    val lista = listOf(1, 2, 3, 4, 5)
    val t = lista.fold(0) { acum: Int, siguiente: Int ->
        acum + siguiente
    }
    println(t)
    /*
    * Cuando llamamos a la función forEach no hace falta el paréntesis
    * porque sólo tiene un parámetro de tipo función que pasamos como
    * una expresión lambda fuera del paréntesis
    * */
    lista.forEach {
        println(it)
    }
}