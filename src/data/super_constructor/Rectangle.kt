package data.super_constructor

class Rectangle(
  override val name : String,
  override val shape : Int,
  override val color: String
) : Shape(name,shape,color) {
  constructor(name: String, shape: Int) : this(name,shape,"")
  constructor(name: String) : this(name,-1,"")

  override fun printName() {
    println("This is Rectangle $name, with the parent => ${super.name}")
  }
}
