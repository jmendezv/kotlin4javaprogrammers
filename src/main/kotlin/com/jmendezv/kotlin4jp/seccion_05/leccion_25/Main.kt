package com.jmendezv.kotlin4jp.seccion_05.leccion_25

/*
* LECCIÓN 25: HIGHER-ORDER FUNCTIONS
*
* Un ejemplo de higher-order function es la función fold() de la librería
* de Kotlin, que se puede aplicar acualquier colección porque es una función
* de extensión de la interfaz Collections.
*
* */

fun <T, R> Collection<T>.fold(
    initial: R,
    combine: (acc: R, nextElement: T) -> R
): R {
    var accumulator: R = initial
    for (element: T in this) {
        accumulator = combine(accumulator, element)
    }
    return accumulator
}

// f es una función de tipo (String, String) : String
val f = fun(acum: String, siguiente: String): String = acum + siguiente.uppercase()

// g es una función de tipo (Int, String) : Int
val g = fun(acum: Int, siguiente: String): Int = acum + siguiente.length

/*
* En Kotlin, una clase puede heredar de una tipo de función expresado
* de la forma (A, B) -> C, en tanto en cuanto, implemente el método invoke().
* El método invoke() se ejecuta a modo de constructor
* */
class StringTransformer: (Int, String) -> Int {
    override fun invoke(p1: Int, p2: String): Int {
        return p1 + p2.trim().length
    }

}

val stringFunction: (Int, String) -> Int = StringTransformer()

fun main() {
    val lista = listOf("Alfa, ", "Bravo, ", "Charlie, ", "Delta.")
    val resultado1 = lista.fold<String, String>(initial = "", combine = f)
    println(resultado1)
    val resultado2 = lista.fold<String, Int>(initial = 0, combine = g)
    println(resultado2)
    val resultado3 = lista.fold<String, Int>(initial = 0, combine = stringFunction)
    println(resultado3)
}