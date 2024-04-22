package com.jmendezv.kotlin4jp.seccion_03.leccion_08

fun main() {
    // La función when utiliza múltiples ramas y también se puede usar como expresión
    // La rama else es obligatoria si no se cubren todos los casos
    val nota = 9
    val calificación = when (nota) {
        !is Int -> "La nota es un numero entero"
        !in 0..10 -> "Nota es un número entre 0 y 10"
        in 0..4 -> "En proceso de mejora"
        5 -> "Sufi"
        6 -> "Bien"
        in 7..8 -> "Notable"
        9 -> "Excelente"
        10 -> "Matricula de honor"
        else -> "Error de calificación"
    }
}