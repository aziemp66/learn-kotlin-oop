package learn

import data.inner_class.Boss

fun main() {
  val eko = Boss("Eko")
  val joko = eko.Employee("Joko")
  joko.hi()
}