package com.jmendezv.kotlin4jp.seccion_04.leccion_12

import java.math.RoundingMode
import kotlin.math.absoluteValue
import kotlin.math.round
import kotlin.random.Random

/*
* LECCIÓN 12: LAS PROPIEDADES Y CAMPOS
*
* */

/*
* En este constructor de la clase Estudiante, id, nombre y becado son propiedades,
* nota es parámetro. Dentro del cuerpo de la clase se define una propiedad nota.
*
* Las propiedades pueden ser mutables (var) o inmutables (val). Las propiedades
* var pueden tener un método get() y otro set() y las propiedades inmutables sólo
* pueden tener un método get().
*
* Kotlin proporciona un campo de respaldo (backing field) que sólo se puede utilizar
* dentro de la definición del un método set() de una propiedad mutable.
*
*
* */
class Estudiante(
    val id: Long,
    val nombre: String,
    nota: Double,
    var becado: Boolean = false
) {
    var nota: Double = nota
//        get() = field.toBigDecimal().setScale(2, RoundingMode.UP).toDouble()
        get() = String.format("%.2f", field).toDouble()
        set(value) {
            // field se trata de una campo de respaldo que se refiere a nota
            field = if (value in 0.0..10.0) value else 0.0
        }
    val esBuenEstuiate: Boolean
        get() = nota > 9.5

    constructor(nombre: String) : this(Random.nextLong().absoluteValue, nombre, 0.0)

    public fun obtieneBeca() = !becado && nota > 9.5

    override fun toString(): String = """
        Estudiant[id = $id, nombre = $nombre, nota = $nota, becado = ${if (becado) "Sí" else "No]"}
    """.trimIndent()

    override fun hashCode(): Int = id.toInt()

    override fun equals(other: Any?): Boolean =
        if (other is Estudiante) id == other.id else false

    // Metodos estaticos
    companion object Factory {
        fun createInstance(nombre: String) = Estudiante(nombre)
    }

}

fun main() {
    val e = Estudiante.createInstance("Juan")
    e.nota = 8.4456
    println(e)
}