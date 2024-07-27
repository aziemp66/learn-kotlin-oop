package data.anonymous_class

interface Action {
  fun action(): Unit
}

fun fireAction(action: Action): Unit {
  action.action()
}