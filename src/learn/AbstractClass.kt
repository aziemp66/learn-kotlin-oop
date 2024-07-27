package learn

import data.abstract_class.City
import data.abstract_class.Location

fun main() {
  // cant declare object cuz class is abstract
  //  val location = Location("Moon")

  val city = City("Palembang")
  println(city.name)
}