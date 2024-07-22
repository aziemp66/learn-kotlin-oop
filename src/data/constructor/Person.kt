package data.constructor

class Person(
  firstNameParam: String,
  middleNameParam: String?,
  lastNameParam: String
) {
  var firstName: String = firstNameParam
  var middleName: String? = middleNameParam
  val lastname: String = lastNameParam
}