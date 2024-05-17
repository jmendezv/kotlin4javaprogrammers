package com.jmendezv.kotlin4jp.seccion_06.leccion_33

/*
* LECCIÓN 33: ¿CUÁNDO DOS OBJETOS SON IGUALES?
*
* */

data class CuentaCorriente(val titular: String, var saldo: Double)

fun main() {
   val cc1 = CuentaCorriente("Juan", 1000.0)
   val cc2 = CuentaCorriente("Juan", 1000.0)
   val cc3 = cc2
   // Igualdad según el método equals donde participan todas las propiedades del constructor principal
   println(cc1 == cc2)
   println(cc1 == cc3)
   // Igualdad según la dirección de memória de las referencias cc2 y cc3 en este caso
   println(cc1 === cc2)
   println(cc2 === cc3)
   println(cc1.hashCode())
   // En general, si dos objetos son iguales, deben tener el mismo código hash
   println(cc2.hashCode())
   println(cc3.hashCode())
   var a = 1
   var b = 1
   println(a == b)
   println(a === b)
}