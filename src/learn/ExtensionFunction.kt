package learn

import data.extension_function.Student

fun Student.sayGoodbye(name: String): Unit {
  println("Goodbye $name, my name is ${this.name}")
}

fun Student?.sayHello(name: String): Unit {
  // cannot access since age is private
  //  println("Hello $name, my age is ${this.age}")
  if (this != null ){
    println("Hello $name, my name is ${this.name}")
  } else {
    println("Hello $name")
  }
}

fun main() {
  val azie = Student("Azie",21)
  azie.sayGoodbye("Ledib")

  val jaki : Student? = null
  jaki.sayHello("Wantok")
}