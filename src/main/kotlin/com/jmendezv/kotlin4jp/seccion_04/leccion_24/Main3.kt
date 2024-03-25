package com.jmendezv.kotlin4jp.seccion_04.leccion_24

/*
* Reglas de sobrescritura
*
* Como ves en este ejemplo de la propia documentación de Kotlinlang.org
* la clase Square hereda el método draw() de dos fuentes, por lo tanto,
* estamos obligados a hacer nuestra propia implementación
* */
open class Rectangle {
    open fun draw() {
        println("Rectangle.draw()")
    }
}

interface Polygon {

    /*
    * Una interfaz es abstracta y sus miembros son open por defecto
    * */
    fun draw() {
        println("Polygon.draw()")
    }
}

class Square() : Rectangle(), Polygon {
    // The compiler requires draw() to be overridden:
    override fun draw() {
        super<Rectangle>.draw() // call to Rectangle.draw()
        super<Polygon>.draw() // call to Polygon.draw()
        println("Squrare.draw()")
    }
}

fun main() {
   val s = Square()
    s.draw()
}