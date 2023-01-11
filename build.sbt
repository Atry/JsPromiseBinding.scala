enablePlugins(ScalaJSPlugin)

organization := "com.thoughtworks.binding"

name := "JsPromiseBinding"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.15" % Test

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.1.0+107-1732b914"

enablePlugins(Example)

import meta._
exampleSuperTypes := exampleSuperTypes.value.map {
  case init"_root_.org.scalatest.FreeSpec" =>
    init"_root_.org.scalatest.AsyncFreeSpec"
  case otherTrait =>
    otherTrait
}

exampleSuperTypes += init"_root_.com.thoughtworks.binding.QueueAsyncTestSuite"

jsEnv := new org.scalajs.jsenv.nodejs.NodeJSEnv()
