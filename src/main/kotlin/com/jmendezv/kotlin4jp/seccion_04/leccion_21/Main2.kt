package com.jmendezv.kotlin4jp.seccion_04.leccion_21

/*
* Object declarations
*
* El patrón Singleton es muy útil en algunos escenarios y Kotlin hace muy fácil
* declararlos.
*
*
* */

class DataProvider

object DataProviderManager {
    fun registerDataProvider(provider: DataProvider) {
        // ...
    }
    val allDataProviders: Collection<DataProvider>
        get() = TODO()
}

fun main() {
    DataProviderManager.registerDataProvider(DataProvider())
}