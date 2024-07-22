package data.secondary_constructor

class Person(
  firstNameParam: String,
  middleNameParam: String?,
  lastNameParam: String
) {
  constructor(firstNameParam: String, lastNameParam: String) : this(firstNameParam, null, lastNameParam) {

  }

  var firstName: String = firstNameParam
  var middleName: String? = middleNameParam
  val lastname: String = lastNameParam
  val greetings: String = "Hello from $firstName $middleName $lastname"

  init {
    println(greetings)
  }
}