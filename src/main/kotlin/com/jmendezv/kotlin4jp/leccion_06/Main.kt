package com.jmendezv.kotlin4jp.leccion_06

import java.util.*

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
}
