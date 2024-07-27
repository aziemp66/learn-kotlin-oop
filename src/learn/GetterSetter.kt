package learn

import data.getter_setter.Note

fun main() {
  val n = Note("Grocery")

  n.title = ""

  println(n.title)
  println(n.upperCaseTitle)
}