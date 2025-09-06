// src/main/scala/org/mypackage/Main.scala
package org.mypackage

import org.apache.spark.sql.SparkSession

object Main extends App {
  val spark = SparkSession.builder
    .appName("TestApp")
    .config("spark.master", "local[*]")
    .getOrCreate()

  // Минимальное вычисление для демонстрации
  val data = Seq((1, "row"), (2, "another row"))
  val df = spark.createDataFrame(data.toSeq.asInstanceOf[Seq[(Int, String)]])

  df.show()
