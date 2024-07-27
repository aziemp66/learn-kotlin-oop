package data.enum_class

enum class Gender(val desc: String) {
  MALE("Male"),
  FEMALE("Female");

  fun printDescription() {
    println(desc)
  }
}