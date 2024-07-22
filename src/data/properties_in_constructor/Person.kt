package data.properties_in_constructor

class Person(
  var firstName: String,
  var middleName: String?,
  val lastname: String,
) {
  constructor(firstNameParam: String, lastNameParam: String) : this(firstNameParam, null, lastNameParam) {
    // do something here
  }

  val greetings: String = "Hello from $firstName $middleName $lastname"

  init {
    println(greetings)
  }
}