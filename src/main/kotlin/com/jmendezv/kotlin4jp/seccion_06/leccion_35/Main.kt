package com.jmendezv.kotlin4jp.seccion_06.leccion_35

/*
* LECCIÓN 35: ANULABILIDAD
*
* */


fun main() {
    var s1: String = "cadena"
    println(s1.length)
    val s2: String? = "cadena"
    // El compilador nos avisa de que s2 puede ser nula
    // val l = s2.length
    // Así podemos solucionar el problema
    val l1 = if (s2 != null) s2.length else 0
    // Otra solución es usar el operador safe call ?. Pero el resulado puede ser null
    val l2: Int? = s2?.length
    // La solución para que no sea nulo es usar el operador Elvis
    // Si s2 no es nulo retorna lenght si es nulo retorna 0
    // La expresión a la derecha del operador Elvis solo se evalua si s2 es null
    val l3 = s2?.length ?: 0
    // La linea 24 lanza una NPE
    val s: String = null!!
}