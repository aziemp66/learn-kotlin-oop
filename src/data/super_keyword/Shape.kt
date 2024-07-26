package data.super_keyword

open class Shape {
  open val corner = 10

  open fun printName(){
    println("Shape")
  }
}

class Rectangle : Shape() {
  override val corner = 4
  val parentCorner = super.corner

  override fun printName() {
    println("This is Rectangle, with the parent => ")
    super.printName()
  }
}