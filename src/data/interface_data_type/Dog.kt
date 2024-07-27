package data.interface_data_type


class Dog : Animal{
  override val name = "Dog"
  override fun sayHello(name: String) {
    super.sayHello(name)
    println("Hello $name, this is a ${this.name} talking")
  }
}