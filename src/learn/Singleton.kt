package learn

import data.singleton.Application
import data.singleton.Utilities

fun main() {
  val result = Utilities.toUpper("Azie")
  println(result)
  println(Utilities.name)

  val innerObject = Application()
  innerObject.sayHello(Utilities.name)
}