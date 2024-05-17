package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_47

/*
* LECCION 47: SCOPE FUNCTIONS: apply
*
* Devuelve el objeto de contexto en sí, recomendamos usarlo para bloques de código que no devuelven un valor y
* que operan principalmente en los miembros del objeto receptor.
*
* El caso de uso más común de aplicar es la configuración de objetos.
*
* Estas llamadas pueden leerse como "aplicar las siguientes asignaciones al objeto".
*
* Otro caso de uso de apply es incluir apply en múltiples cadenas de llamadas para un procesamiento más complejo.
*
* */

data class Person(var name: String, var age: Int = 0, var city: String = "")

fun main() {

   val adam = Person("Adam").apply {
      age = 32
      city = "London"
   }
   println(adam)

}