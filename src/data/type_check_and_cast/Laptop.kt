package data.type_check_and_cast

class Laptop(
  override val Brand: String,
  override val Cpu : String,
  val Battery : Float
) : Computer(
  Brand,
  Cpu,
  ) {
}