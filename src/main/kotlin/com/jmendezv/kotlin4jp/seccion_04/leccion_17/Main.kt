package com.jmendezv.kotlin4jp.seccion_04.leccion_17

/*
* LECCIÓN 17: SEALED CLASSES AND INTERFACES
*
* */

enum class TipoDeError {
    LEVE,
    MODERADO,
    IMPORTANTE,
    CRITICO,
    MUY_CRITICO
}

/*
* Los constructores de una clase sellada pueden ser protected (por defecto) o private,
* que todavia ofrecen más seguridad.
* */
sealed class Error private constructor(val tipoDeError: TipoDeError) {
    class ErrorDeLectura(val nombreFichero: String) : Error(TipoDeError.LEVE)
    class ErrorDeBaseDeDatos(val tabla: String, val consulta: String) : Error(TipoDeError.IMPORTANTE)
    class ErrorDeServidor() : Error(TipoDeError.MUY_CRITICO)
}

// class ErrorDesconocido : Error(TipoDeError.MODERADO)

fun main() {
    val error: Error = Error.ErrorDeLectura("movimienetos.txt")
    // La estructura when no necesita la rama 'else' porque el compilador sabe que se han tratado
    // todos los casos posible
    when (error) {
        is Error.ErrorDeLectura -> println("Error de lectura")
        is Error.ErrorDeBaseDeDatos -> println("Error de BD")
        is Error.ErrorDeServidor -> println("Error de Servidor")
    }
}