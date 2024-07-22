package data

class Person(
  firstNameParam: String,
  middleNameParam: String?,
  lastNameParam: String
) {
  var firstName: String = firstNameParam
  var middleName: String? = middleNameParam
  private val lastname: String = lastNameParam

  init {
    println("Hello! $firstName ${middleName} $lastname")
  }
}