// build.sbt
name := "test-scala-spark"
version := "1.0"
scalaVersion := "3.1.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.0",
  "org.apache.spark" %% "spark-sql" % "3.3.0"
)