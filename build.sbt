name := "Scala.js Tutorial"

version := "0.1"

scalaVersion := "2.12.12"

enablePlugins(ScalaJSPlugin)

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.8.0"
//libraryDependencies += "me.shadaj" %%% "slinky-core" % "0.7.4" //% Test
//libraryDependencies += "me.shadaj" %%% "slinky-web" % "0.7.4" //% Test
