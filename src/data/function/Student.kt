package data.function

class Student (
  private val name: String
){
  fun sayHello(yourName: String){
    println("Hello $yourName, my name is $name")
  }

  fun sayHello(firstName: String, lastName: String){
    println("Hello $firstName $lastName, my name is $name")
  }
}