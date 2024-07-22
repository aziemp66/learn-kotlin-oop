package data.this_keyword

class Student (
  private val name: String
){
  fun sayHello(name: String){
    println("Hello $name, my name is ${this.name}")
  }

  fun sayHello(firstName: String, lastName: String){
    println("Hello $firstName $lastName, my name is $name")
  }
}