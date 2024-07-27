package data.inner_class

class Boss(
  val name: String
) {
  inner class Employee(val name: String) {
    fun hi(): Unit {
      println("Hi I'm ${this@Employee.name}, and my boss is ${this@Boss.name}")
    }
  }
}