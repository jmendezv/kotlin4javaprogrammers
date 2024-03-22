package com.jmendezv.kotlin4jp.seccion_04.leccion_23

import kotlin.properties.Delegates

/*
* LECCIÓN 23: LAS PROPIEDADES DELEGADAS
*
* */


/*
* El patrón observable
* */
class Deposito(val ident: Long, nivelInicial: Double) {
    var nivel: Double by Delegates.observable(nivelInicial) { property, oldValue, newValue ->
        if (newValue < 50.0) {
            throw Exception("Depósito #$ident tiene $newValue l. por debajo del 50%")
        }
    }

    fun libera(flujo: Double): Unit {
        nivel -= flujo
    }
}

class DepositoConVeto(val ident: Long, nivelInicial: Double) {
    var nivel: Double by Delegates.vetoable(nivelInicial) { property, oldValue, newValue ->
        newValue >= 50
    }

    fun libera(flujo: Double): Unit {
        nivel -= flujo
    }
}

fun main() {
    val deposito = Deposito(453342L, 100.0)
    try {
        deposito.libera(10.0) // 90L. OK
        deposito.libera(10.0) // 80L. OK
        deposito.libera(10.0) // 70L. OK
        deposito.libera(10.0) // 60L. OK
        deposito.libera(10.0) // 50L. OK
        deposito.libera(10.0) // 40L. Salta excepción
        deposito.libera(5.0)
    } catch (e: Exception) {
        println(e.message)
    }
    val depositoConVeto = DepositoConVeto(983434534L, 100.0)
    depositoConVeto.libera(30.0) // 70L. OK
    println(depositoConVeto.nivel)
    depositoConVeto.libera(30.0) // 40L. La operación está vetada y no se descuentan los 30 litros
    println(depositoConVeto.nivel)
}