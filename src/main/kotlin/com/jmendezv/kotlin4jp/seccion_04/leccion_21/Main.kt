package com.jmendezv.kotlin4jp.seccion_04.leccion_21

/*
* LECCION 21: LAS EXPRESIONES Y DECLARACIONES DE TIPO OBJECT
*
* Alguna vez necesitamos crear un objeto que es una simple variación de una clase dada, sin la necesidad de declarar
* una subclase ad hoc.
*
* Kotlin puede solucionar esto mediante 'object expressions' y 'object declarations'.
*
* las expresiones object crean objetos de clases anónimas, esto es, clases que no han sido creadas con una declaración
* explícita de typo class.
* Estos objetos son útilices para utilizarlo puntualmente.
* Estos objetos anónimos se pueden definir desde cero, heredando desde alguna clase o implementando interfaces.
* Por lo tanto, los objetos anónimos son instancias de clases anónimas y se llaman así porque se definen mediante una
* expresión no mediante un nombre.
*
* */

/*
* object expressions
*
* Esta es la definición más tribial de objeto. Por defecto, heredan de Any, por lo tanto, podemos modificar sus métodos
* */

val holaMundo = object {
   val saludo = "Hola Mundo"
   override fun toString() = "$saludo, desde un objeto."
}

interface Driver {
   fun connect(url: String): Boolean
}

class Server(val driver: Driver)

/*
* Un data object sigue el patrón Singleton. Todas las instancias comparten sus propiedades
* */

interface Factory<T> {
   fun create(): T
}

/*
* Aunque los métodos de un companion object parezcan a simple vista como los métodos estáticos de otros lenguajes,
* en tiempo de ejecución un companion object puede implementar interfaces.
*
* Cuando queremos generar métodos realmente estáticos, quizás por temas de interoperatibilidad con Java, podemos usar
* la anotación @JvmStatic
*
* */

class MyClass {

   companion object Companion : Factory<MyClass> {
      @JvmStatic
      override fun create(): MyClass = MyClass()
   }
}

fun main() {
   println(holaMundo)
   holaMundo.also {
      println(it.toString())
   }
   // Implementación de la interfaz Driver con un object
   val server = Server(object : Driver {
      override fun connect(url: String): Boolean {
         // ...
         return true
      }
   })

   if (server.driver.connect("http://whatever/resource"))
      println("conectado")
   else
      println("algo fué mal")
   val portatil1 = Portatil
   println(portatil1)
   val portatil2 = Portatil
}