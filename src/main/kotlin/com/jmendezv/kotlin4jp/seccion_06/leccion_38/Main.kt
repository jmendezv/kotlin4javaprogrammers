package com.jmendezv.kotlin4jp.seccion_06.leccion_38

import kotlin.reflect.KClass
import kotlin.reflect.KFunction

/*
* LECCION 38: LA API REFLECTION
*
* */

class UnaClaseCualquiera

fun main() {
    val classKotlin: KClass<UnaClaseCualquiera> = UnaClaseCualquiera::class
    val classJava: Class<UnaClaseCualquiera> = UnaClaseCualquiera::class.java
    val funcion: KFunction<UnaClaseCualquiera> = ::UnaClaseCualquiera
    println(classKotlin.isFinal)
    println(classKotlin.qualifiedName)
    println(classJava.canonicalName)
    println(funcion.name)
}