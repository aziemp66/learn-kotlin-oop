package learn

import data.anonymous_class.Action
import data.anonymous_class.fireAction

fun main() {
  fireAction(object : Action {
    override fun action() {
      println("Action One")
    }
  })
  fireAction(object : Action {
    override fun action() {
      println("Action Two")
    }
  })
}