package data.overriding

open class Employee (
  open val name: String
) {
  open fun sayHello(name: String){
    println("Hello $name, my name is ${this.name}")
  }
}