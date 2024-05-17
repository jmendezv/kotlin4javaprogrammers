package com.jmendezv.kotlin4jp.seccion_04.leccion_13

/*
* LECCION 13: CLASES ENUM, CLASES ABSTRACTAS E INTERFACES
*
* */
enum class Direccion {
   DERECHA, IZQUIERDA,
}

enum class Energia(val co2: Double) {
   GASOLINA(5.6), GASOIL(9.8), HIBRIDO(1.4), ELECTRICO(0.23), GAS(0.02);

   val esContaminante = co2 < 2.0
}

interface Motor {
   val marca: String
   val cc: Int
   val energia: Energia
}

abstract class Vehiculo(val matricula: String) {
   abstract var motor: Motor
   abstract fun arranca()
   abstract fun gira(direccion: Direccion, grados: Double)
   abstract fun endereza()
   abstract fun frena(intensidad: Double, duracion: Int)
   fun vehiculoVerde() = motor.energia.esContaminante
}

fun main() {
   // Las clases abstractar no se pueden instanciar directamente
//    val vehiculo = Vehiculo("5403KJK")

   val vehiculo = object : Vehiculo("LMN 2390") {
      override var motor: Motor = object : Motor {
         override val marca: String
            get() = "BMW"
         override val cc: Int
            get() = 4567
         override val energia: Energia
            get() = Energia.ELECTRICO
      }

      override fun arranca() {
         TODO("Not yet implemented")
      }

      override fun gira(direccion: Direccion, grados: Double) {
         TODO("Not yet implemented")
      }

      override fun endereza() {
         TODO("Not yet implemented")
      }

      override fun frena(intensidad: Double, duracion: Int) {
         TODO("Not yet implemented")
      }
   }
}