package data.super_keyword

class Rectangle : Shape() {
  override val corner = 4
  private val parentCorner = super.corner

  override fun printName() {
    println("This is Rectangle, with the parent => $parentCorner")
    super.printName()
  }
}
