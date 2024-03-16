package com.jmendezv.kotlin4jp.leccion_07.entidades

/*
* Las clases son public y final por defecto, no es necesario
* */
public final class Estudiante (
    private val nombre: String,
    val fdn: String,
    protected var nota: Double) {
}