package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_47

/*
* LECCION 47: SCOPE FUNCTIONS: run
*
* Hace lo mismo que con pero se implementa como una función de extensión.
*
* Entonces, al igual que let, puedes llamarlo en el objeto de contexto usando notación de puntos.
*
* run es útil cuando su lambda inicializa objetos y calcula el valor de retorno.
*
* run también se puede invocar como una función que no es de extensión.
*
* En este caso no tiene objeto de contexto, pero sí que retorna el resultado de la lambda.
*
* run puede entenderse como: ejecuta el código y computa el resultado
* */

class MultiportService(var url: String, var port: Int) {
   fun prepareRequest(): String = "Default request"
   fun query(request: String): String = "Result for query '$request'"
}
fun main() {
   val service = MultiportService("https://example.kotlinlang.org", 80)
   // La función run hace lo mismo que with, pero esta implementada como una función de extensión
   // por lo tanto se invoca con el punto
   val result = service.run {
      port = 8080
      query(prepareRequest() + " to port $port")
   }
   // El mismo código con let nos obliga a escribir más
   val letResult = service.let {
      it.port = 8080
      it.query(it.prepareRequest() + " to port ${it.port}")
   }
   println(result)
   println(letResult)
   val hexNumberRegex = run {
      val digits = "0-9"
      val hexDigits = "A-Fa-f"
      val sign = "+-"

      Regex("[$sign]?[$digits$hexDigits]+")
   }
   for (match in hexNumberRegex.findAll("+123 -FFFF !%*& 88 XYZ")) {
      println(match.value)
   }
}