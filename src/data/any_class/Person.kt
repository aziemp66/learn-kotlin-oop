package data.any_class

class Person(
  val name: String
) {
  override fun toString(): String {
    return "this is $name"
  }

  override fun equals(other: Any?): Boolean {
    return when (other) {
      is Person ->
        this.name == other.name

      else ->
        super.equals(other)
    }
  }

  override fun hashCode(): Int {
    return name.hashCode()
  }
}