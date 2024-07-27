package data.interface_data_type


class Dog : Animal,Mammals{
  override val name = "Dog"

  override fun sayHello(name: String) {
    println("Hello $name, this is a ${this.name} talking")
  }

  override fun talk() {
    super.talk()
    println("Meow ${this.name}")
  }
}