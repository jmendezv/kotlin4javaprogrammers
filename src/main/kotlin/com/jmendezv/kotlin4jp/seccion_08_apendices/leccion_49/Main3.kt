package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_49

import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet


data class Department(val dept_no: String, var dept_name: String) {
   override fun toString(): String = "[$dept_no, $dept_name]"
}

fun main() {
   val jdbcUrl: String = "jdbc:mysql://localhost:3306/employees"
   val connection: Connection = DriverManager
      .getConnection(jdbcUrl, "root", "admin")
   // println(connection.isValid(0))
   // the query is only prepared not executed
   val query: PreparedStatement = connection.prepareStatement("SELECT * FROM departments")

   // the query is executed and results are fetched
   val result: ResultSet = query.executeQuery()

   // an empty list for holding the results
   val departments: MutableList<Department> = mutableListOf()

   while (result.next()) {

      // getting the value of the id column
      val id: String = result.getString("dept_no")
      val name: String = result.getString("dept_name")

      departments.add(Department(id, name))
   }

   departments.forEach(::println)
}