error id: file:///C:/GitHub/Scala/build.sbt:
file:///C:/GitHub/Scala/build.sbt
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -scalaVersion.
	 -scalaVersion#
	 -scalaVersion().
	 -scala/Predef.scalaVersion.
	 -scala/Predef.scalaVersion#
	 -scala/Predef.scalaVersion().
offset: 60
uri: file:///C:/GitHub/Scala/build.sbt
text:
```scala
// build.sbt
name := "test-scala-spark"
version := "1.0"
@@scalaVersion := "2.12.15"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.0",
  "org.apache.spark" %% "spark-sql" % "3.3.0"
)
```


#### Short summary: 

empty definition using pc, found symbol in pc: 