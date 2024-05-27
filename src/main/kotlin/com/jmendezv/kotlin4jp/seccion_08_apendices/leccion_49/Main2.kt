package com.jmendezv.kotlin4jp.seccion_08_apendices.leccion_49

import org.ktorm.database.Database
import org.ktorm.dsl.from
import org.ktorm.dsl.select
import org.ktorm.logging.ConsoleLogger
import org.ktorm.logging.LogLevel
import org.ktorm.schema.*

/*
* create database ktorm;
* use ktorm;
* create table t_department(
  id int not null primary key auto_increment,
  name varchar(128) not null,
  location varchar(128) not null
);
* create table t_employee(
  id int not null primary key auto_increment,
  name varchar(128) not null,
  job varchar(128) not null,
  manager_id int null,
  hire_date date not null,
  salary bigint not null,
  department_id int not null
);
*
* insert into t_employee values (null, 'joe', 'programmer', 1234, '2023-01-01', 3456, 10);
*
* */

fun main() {
   val database = Database.connect(
      "jdbc:mysql://localhost:3306/ktorm",
      user = "root",
      password = "admin",
      logger = ConsoleLogger(threshold = LogLevel.DEBUG))

   for (row in database.from(Employees).select()) {
      println(row[Employees.name])
   }
}