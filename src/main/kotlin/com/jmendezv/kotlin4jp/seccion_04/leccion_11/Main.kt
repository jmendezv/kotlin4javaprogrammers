package com.jmendezv.kotlin4jp.seccion_04.leccion_11

import kotlin.math.absoluteValue
import kotlin.random.Random

/*
* LECCIÓN 11: CLASES
*
* */

class SimpleClass

/*
* Las clases en Kotlin por defecto son finales, no pueden tener subclases.
* La palabra clave constructor puede omitirse cuando se trata del constructor principal
* siempre y cuando no tenga anotaciones ni modificadores de visibilidad, como en este caso.
* El contructor principal puede estar formado por propiedades y/o simples parámetros.
* los demás constructores sólo pueden tener parámetros.
* El constructor secundario y sucesivos deben llamar a un constructor superior, en este caso,
* el constructor secundario está llamando al constructor primario mediante la palabra
* reservada 'this' que es una referencia a la instancia actual.
* Puede haber tantos bloques init{} como queramos, que se ejecutaran en el orden de
* aparición.
* Los métodos son publicos por defecto.
* Se pueden sobreescribir los métodos de la clase Any de donde derivan todas las clases
* en Kotlin (Object en Java) como por ejemplo: toString(), hashCode() o equals()
* val designa un variable inmutable mientras que var designa un variable mtuable.
* Una clase puede tener uno y solo un companion object, util cuando queremos
* añadir métodos estáticos en las clases de Kotlin. Típicamente son métodos de factoría
* para la creación de instacias complejas de la propia clase que la contiene.
* */

final class Estudiante constructor(
    val id: Long,
    val nombre: String,
    nota: Double,
    var becado: Boolean = false
) {

    init {
        println("Clase Estudiante instanciada")
    }

    var nota: Double = if (nota in 0.0..10.0) nota else 0.0

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
        fun comoAprobar() = "Estudiando mucho."
    }

}

fun main() {
    // En Kotlin no se requiere el operador 'new'
    val sc = SimpleClass()
    val e = Estudiante("Mariana")
    e.nota = 9.9
    println(e)
    println(e.obtieneBeca())
    println(Estudiante.comoAprobar())
    val e2 = Estudiante.createInstance("Juan")
    println(e2)
}