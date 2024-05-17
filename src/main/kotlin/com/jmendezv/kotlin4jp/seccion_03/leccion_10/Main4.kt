package com.jmendezv.kotlin4jp.seccion_03.leccion_10

/*
* Retorno local, sale de la función forEach().
* Es equivalente al ejemplo anterior, pero con una etiqueta implícita
* */
fun demo3() {
   listOf(1, 2, 3, 4, 5).forEach { valor ->
      if (valor == 3) return@forEach // Sale del bucle no de la función
      println(valor)
   }
   println("A este punto sí que llega.")
}

/*
* Retorno local, sale de la función anónima al bucle forEach().
* Es equivalente al ejemplo anterior, pero con una función anónima.
* */
fun demo4() {
   listOf(1, 2, 3, 4, 5).forEach(fun(valor: Int) {
      if (valor == 3) return
      println(valor)
   })
   println("A este punto sí que llega.")
}

fun main() {
   println("demo3()")
   demo3()
   println("demo4()")
   demo4()
}