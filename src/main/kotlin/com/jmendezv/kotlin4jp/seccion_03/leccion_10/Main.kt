package com.jmendezv.kotlin4jp.seccion_03.leccion_10

/*
* LECCIÓN 10: TIPOS DE RUPTURA DE SECUENCIA
*
* */

fun demo() {
    var i = 0
    loop@ while (i < 10) {
        println("En while $i")
        i += 1
        if (i == 5) continue
        var j = i
        do {
            // Este break sale del while()
            if (j * i >= 25) break@loop
            // Este break sale del do
            if (j * i >= 15) break
            println(j * i)
        } while (j++ < 4)
    }
}

fun main() {
    println("demo()")
    demo()
}