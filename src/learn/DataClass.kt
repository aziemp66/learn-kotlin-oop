package learn

import data.data_class.Product

fun main() {
  val product = Product("Shampoo", 30_000L, "Beauty")
  val product2 = product.copy()
  val product3 = product2.copy(price = 21_000L)

  println(product)
  println(product2)
  println(product3)
}