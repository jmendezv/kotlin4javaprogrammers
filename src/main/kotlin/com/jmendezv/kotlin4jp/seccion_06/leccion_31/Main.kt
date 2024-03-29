package com.jmendezv.kotlin4jp.seccion_06.leccion_31

/*
* LECCIÓN 31: LAS COMPROVACIONES Y CONVERSIONES DE TIPO
*
* */

// Smart cast, conversión de tipo automática
fun demo1(param: Any) = if (param is String) param.length else 0

// Smart cast, conversión de tipo automática
fun demo2(param: Any) = when(param) {
    is Int -> param + 1
    is String -> param + param
    else -> throw IllegalArgumentException("argumento no es ni entero ni cadena.")
}

fun main() {
    var s: String? = "Cualquier cadena"
    if (s !is String) {
        println("No es una cadena")
    } else {
        // El compilador 'sabe' que s es un String
        println(s.length)
    }
    s = null
    // safe nullable cast operator. El resultado es null
    val u = s as? String
    println(u)
    // NPE: null cannot be cast to non-null type kotlin.String
    val t: String = s as String
}