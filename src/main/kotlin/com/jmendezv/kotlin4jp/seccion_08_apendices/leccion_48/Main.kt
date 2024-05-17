package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_48

import java.io.BufferedReader
import kotlin.io.path.Path
import kotlin.io.path.bufferedReader
import kotlin.io.path.bufferedWriter

/*
* LECCION 48: LA API KOTLIN.IO
*
* */

fun leeFichero(fileName: String): String {
   var ret: String = ""
   val bufferedReader: BufferedReader = Path(fileName).bufferedReader()
   bufferedReader.forEachLine {
      ret += it
   }
   bufferedReader.close()
   return ret
}

fun escribeFichero(fileName: String, text: String): Unit {
   val bufferedWriter = Path(fileName).bufferedWriter()
   bufferedWriter.write(text)
   bufferedWriter.close()
}

fun main(args: Array<String>) {
   escribeFichero("fichero1.txt", "Contenido del fichero1...")
   println(leeFichero("fichero1.txt"))
}