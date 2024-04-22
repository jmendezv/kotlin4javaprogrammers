package com.jmendezv.kotlin4jp.seccion_04.leccion_23

import kotlin.properties.ReadWriteProperty
import kotlin.random.Random
import kotlin.reflect.KProperty

/*
*
* Delegados personalizados
*
* */

data class Resource(val id: Long, val url: String)

fun resourceDelegate(url: String): ReadWriteProperty<Any?, Resource> =
    object : ReadWriteProperty<Any?, Resource> {
        var curValue = Resource(Random.nextLong(), url)
        override fun getValue(thisRef: Any?, property: KProperty<*>): Resource = curValue
        override fun setValue(thisRef: Any?, property: KProperty<*>, value: Resource) {
            curValue = value
        }
    }

fun main() {
    val readOnlyResource: Resource by resourceDelegate("https://com.example/resource.json")  // Sólo necesita el método getValue()
    var readWriteResource: Resource by resourceDelegate("https://com.example/resource.json") // Necesita los métodos setValue() y getValue()
}