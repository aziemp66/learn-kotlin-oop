package data.any_class

class Person(
  val name :String
) {
  override fun toString(): String {
    return "this is $name"
  }
}