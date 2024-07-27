package data.interface_data_type

interface Animal {
  val name: String
  fun sayHello(name: String): Unit
  fun talk():Unit {
    println("Hi! this is ${this.name} talking")
  }
}