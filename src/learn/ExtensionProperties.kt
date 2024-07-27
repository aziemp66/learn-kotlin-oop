package learn

import data.extension_properties.Student

val Student.upperName : String
  get() = this.name.uppercase()

fun main() {
  val azie = Student("Azie",21)

  println(azie.upperName)
}