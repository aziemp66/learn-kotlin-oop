package learn

import data.Inheritance.Manager
import data.Inheritance.VP

fun main() {
  val budi = Manager("Budi")

  val joko = VP("Joko")

  budi.sayHello("Joko")
  joko.sayHello("Budi")
}