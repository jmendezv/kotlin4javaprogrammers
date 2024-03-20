package com.jmendezv.kotlin4jp.seccion_03.leccion_07.entidades

/*
* Las clases son public y final por defecto, no es necesario
* */
public final class Estudiante (
    private val nombre: String,
    val fdn: String,
    protected var nota: Double) {
}