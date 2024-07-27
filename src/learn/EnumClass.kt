package learn

import data.enum_class.Gender

fun main() {
  val man = Gender.MALE
  val woman = Gender.FEMALE
  val allGender = Gender.entries

  println(man)
  println(woman)
  println(allGender)
}