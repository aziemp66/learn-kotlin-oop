package data.abstract_properties_and_function

class Cat : Animal() {
  override val name = "Cat"
  override fun noise() {
    println("Meow!")
  }
}