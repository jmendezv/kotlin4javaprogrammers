package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_49

import org.ktorm.schema.*

object Employees : Table<Nothing>("t_employee") {
   val id = int("id").primaryKey()
   val name = varchar("name")
   val job = varchar("job")
   val managerId = int("manager_id")
   val hireDate = date("hire_date")
   val salary = long("salary")
   val departmentId = int("department_id")
}