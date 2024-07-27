package learn

import data.sealed_class.Minus
import data.sealed_class.Operation
import data.sealed_class.Plus

fun main() {
  println(operation(10, 12, Minus()))
}

fun operation(val1: Int, val2: Int, operation: Operation): Int {
  return when (operation) {
    is Plus -> val1 + val2
    is Minus -> val1 - val2
  }
}