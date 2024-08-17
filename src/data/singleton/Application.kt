package data.singleton

class Application {
  object Utilities {
    fun Hello(name: String): Unit {
      println(name)
    }
  }

  fun sayHello(name: String): Unit {
    Utilities.Hello(name)
  }
}