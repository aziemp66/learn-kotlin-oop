package learn

import data.Person

fun main() {
  val john = Person("john", null, "Smith")

  john.firstName = "John"
  john.middleName = "Doe"

  // error because properties is immutable
  // john.lastname = "waduh"
}