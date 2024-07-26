package data.overriding

final class Manager(name : String) : Employee(name){
  override fun sayHello(name: String) {
    println("Hello $name, my name is manager ${this.name}")
  }
}