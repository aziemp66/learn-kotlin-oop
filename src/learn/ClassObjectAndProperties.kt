package learn

import data.class_object_and_properties.Person

fun main() {
  val john = Person()

  john.firstName = "John"
  john.middleName = "Doe"
  john.lastname = "Smith"

  println(john)
}