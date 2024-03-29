package com.jmendezv.kotlin4jp.seccion_03.leccion_06

import java.util.*

/*
* LECCIÓN 06: LOS TIPOS BÁSICOS
*
* */
fun main() {
    val l = 1L
    val ul = 1UL
    val f = 1.0F
    val bool = !(true && (true || false))
    val c = '\uCAFE'
    // Kotlin acepta alguna secuencia de escape 'scape sequences'
    val singleQuote = '\''
    val tab = '\t'
    val backSlash = '\\'
    val formattedInteger = String.format(Locale.of("ES", "es"), "%1\$+,07d", 1234)
    println(formattedInteger)
    val formattedDouble = String.format(Locale.of("ES", "es"), "%1\$.4f", Math.PI)
    println(formattedDouble)
    val calendar = Calendar.getInstance()
    val formattedDate = String.format(Locale.of("ES", "es"), "%1\$tF", calendar)
    println(formattedDate)
    val s = """
        Esto
        es
        una
        cadena
        multilinea.
    """.trimIndent()
    println(s)
}
