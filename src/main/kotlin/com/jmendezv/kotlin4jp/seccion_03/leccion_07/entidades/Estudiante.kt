package com.jmendezv.kotlin4jp.seccion_03.leccion_07.entidades

/*
* Las clases son public y final por defecto.
* */
data class Estudiante (
    val nombre: String,
    val fdn: String,
    var nota: Double)