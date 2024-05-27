package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_49

import com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_49.Departments.primaryKey
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object Departments : Table<Nothing>("t_department") {
   val id = int("id").primaryKey()
   val name = varchar("name")
   val location = varchar("location")
}