package data.super_constructor

open class Shape(
  open val name: String,
  open val shape: Int,
  open val color: String
) {
  constructor(name: String, shape: Int) : this(name, shape, "")
  constructor(name: String) : this(name, -1)

  open fun printName() {
    println(name)
  }
}
