package com.jmendezv.kotlin4jp.seccion_06.leccion_37

/**
 * @param nombre
 */
@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
// Valor por defecto
@Retention(AnnotationRetention.RUNTIME)
// @Repeatable
@MustBeDocumented
annotation class Autor(val nombre: String)