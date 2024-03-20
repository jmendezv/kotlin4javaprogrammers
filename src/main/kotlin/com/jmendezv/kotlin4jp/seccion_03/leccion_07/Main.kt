package com.jmendezv.kotlin4jp.seccion_03.leccion_07

/*
* LOS PAQUETES Y IMPORTS
*
* */

import com.jmendezv.kotlin4jp.seccion_03.leccion_07.entidades.Estudiante

fun main() {
    val e = Estudiante("Mariana", "31/08/2010", 8.9)
//    println(e.nombre) // Error de acceso: nombre es privado
    println(e.fdn)
//    println(e.nota) // Error de acceso: nota es protected y estamos en otro paquete
}