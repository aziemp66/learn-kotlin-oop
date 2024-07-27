package data.interface_data_type

interface Animal {
  val name: String
  fun sayHello(name: String): Unit {
    println("Test")
  }
}