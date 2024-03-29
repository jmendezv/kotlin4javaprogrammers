package com.jmendezv.kotlin4jp.seccion_06.leccion_37

/**
 * UnaClaseAnotada
 */
@Autor("José")
class UnaClaseAnotada {
    var nombreAutor: String
    init {
        val clase: Class<UnaClaseAnotada> = UnaClaseAnotada::class.java
        val autor: Autor = clase.getAnnotation(Autor::class.java)
        this.nombreAutor = autor.nombre
    }
}