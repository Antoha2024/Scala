error id: file:///C:/GitHub/Scala/build.scala:`org.scalajs::scalajs-linker:1.8.0`.
file:///C:/GitHub/Scala/build.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -`org.scalajs::scalajs-linker:1.8.0`.
	 -`org.scalajs::scalajs-linker:1.8.0`#
	 -`org.scalajs::scalajs-linker:1.8.0`().
	 -scala/Predef.`org.scalajs::scalajs-linker:1.8.0`.
	 -scala/Predef.`org.scalajs::scalajs-linker:1.8.0`#
	 -scala/Predef.`org.scalajs::scalajs-linker:1.8.0`().
offset: 58
uri: file:///C:/GitHub/Scala/build.scala
text:
```scala
// build.sc
import $ivy.`org.scalajs::scalajs-linker:1.8.0@@`
import scalajs.linker.StandardConfig

val config = StandardConfig()
  .withModuleKind(ModuleKind.NoModule)
  .withSourceMap(true)

println(scalajs.cli.LinkerFrontend(config, Nil, Some(new java.io.File("target"))))

```


#### Short summary: 

empty definition using pc, found symbol in pc: 