error id: file:///C:/GitHub/Scala/build.scala:`org.scalajs::scalajs-linker:2.12.15`.
file:///C:/GitHub/Scala/build.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -`org.scalajs::scalajs-linker:2.12.15`.
	 -`org.scalajs::scalajs-linker:2.12.15`#
	 -`org.scalajs::scalajs-linker:2.12.15`().
	 -scala/Predef.`org.scalajs::scalajs-linker:2.12.15`.
	 -scala/Predef.`org.scalajs::scalajs-linker:2.12.15`#
	 -scala/Predef.`org.scalajs::scalajs-linker:2.12.15`().
offset: 38
uri: file:///C:/GitHub/Scala/build.scala
text:
```scala
// build.sc
import $ivy.`org.scalajs::@@scalajs-linker:2.12.15`
import scalajs.linker.StandardConfig

val config = StandardConfig()
  .withModuleKind(ModuleKind.NoModule)
  .withSourceMap(true)

println(scalajs.cli.LinkerFrontend(config, Nil, Some(new java.io.File("target"))))

```


#### Short summary: 

empty definition using pc, found symbol in pc: 