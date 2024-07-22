package data.init

class Person(
  firstNameParam: String,
  middleNameParam: String?,
  lastNameParam: String
) {
  var firstName: String = firstNameParam
  var middleName: String? = middleNameParam
  val lastname: String = lastNameParam
  val  greetings : String = "Hello from $firstName $middleName $lastname"

  init {
    println(greetings)
  }
}