package com.jmendezv.kotlin4jp.seccion_04.leccion_23

import kotlin.properties.Delegates

/*
* El patron Vetoable
* */
class DepositoConVeto(val ident: Long, nivelInicial: Double) {
    var nivel: Double by Delegates.vetoable(nivelInicial) { property, oldValue, newValue ->
        newValue >= 50
    }

    fun libera(flujo: Double): Unit {
        nivel -= flujo
    }
}

fun main() {
    val depositoConVeto = DepositoConVeto(983434534L, 100.0)
    depositoConVeto.libera(30.0) // 70L. OK
    println(depositoConVeto.nivel)
    depositoConVeto.libera(30.0) // 40L. La operación está vetada y no se descuentan los 30 litros
    println(depositoConVeto.nivel)
}