package com.jmendezv.kotlin4jp.seccion_03.leccion_10

import java.rmi.UnexpectedException
import kotlin.random.Random
import kotlin.random.nextInt


/*
* LECCIÓN 10: TIPOS DE RUPTURA DE SECUENCIA
*
* */

fun f(): Unit = println("")

fun g(): Any = throw UnexpectedException("Algo pasó")

// Diseño de función tradicional
fun randomInt1(): Int {
    return Random.nextInt()
}

// Diseño de función abreviado con declaración de tipo de retorn
fun randomInt2(): Int = Random.nextInt()

// Diseño de función abreviado, con tipo de retorno inferido por el compilador
fun randomInt3() = Random.nextInt()

fun demo() {
    var i = 0
    loop@ while (i < 10) {
        println(i)
        i += 1
        if (i == 5) continue
        var j = i
        // Este break sale del while()
        do {
            if (j * i >= 15) break@loop
        } while (j++ < 4)
    }
}

/*
* Retorno no local, sale de la función demo1()
* */
fun demo1() {
    listOf(1, 2, 3, 4, 5).forEach { valor ->
        if (valor == 3) return
        println(valor)
    }
    println("A este punto no llega nunca")
}

/*
* Retorno local, sale dela función forEach() mediante una
* etiqueta explícita
* */
fun demo2() {
    listOf(1, 2, 3, 4, 5).forEach etiqueta@{ valor ->
        if (valor == 3) return@etiqueta
        println(valor)
    }
    println("A este punto sí que llega")
}

/*
* Retorno local, sale dela función forEach().
* Es equivalente al ejemplo anterior, pero con una etiqueta implícita
* */
fun demo3() {
    listOf(1, 2, 3, 4, 5).forEach { valor ->
        if (valor == 3) return@forEach
        println(valor)
    }
    println("A este punto sí que llega")
}

/*
* Retorno local, sale dela función anónima al bucle forEach().
* Es equivalente al ejemplo anterior, pero con una función anónima.
* */
fun demo4() {
    listOf(1, 2, 3, 4, 5).forEach(fun(valor: Int) {
        if (valor == 3) return
        println(valor)
    })
    println("A este punto sí que llega")
}

fun main() {
    println("demo()")
    demo()
    println("\t***************")
    println("demo1()")
    demo1()
    println("\t***************")
    println("demo2()")
    demo2()
    println("\t***************")
    println("demo3()")
    demo3()
    println("\t***************")
}