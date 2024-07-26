package learn

import data.type_check_and_cast.Computer
import data.type_check_and_cast.Laptop

fun main() {
  val master_race = Computer("ASUS", "i7-10xxx")
  val tuf_f15 = Laptop("MSI", "Ryzen-9", 89.00f)
  val devices = arrayOf(master_race,tuf_f15)

  printObjectIf(master_race)
  printObjectWhen(tuf_f15)
  printObjectWhen(devices)

  val s = "Laptop is more mobile than computer"
  printUnsafeCast(s)
  printSafeCast(devices)
}

fun printObjectIf(x: Any): Unit {
  if (x is Laptop) {
    println("This is a ${x.Brand} Laptop with ${x.Cpu} CPU With ${x.Battery} Battery Watt")
  } else if (x is Computer) {
    println("This is a ${x.Brand} Computer with ${x.Cpu} CPU")
  } else {
    println(x)
  }
}

fun printObjectWhen(x: Any): Unit {
  when (x) {
    is Laptop ->
      println("This is a ${x.Brand} Laptop with ${x.Cpu} CPU With ${x.Battery} Battery Watt")
    is Computer ->
      println("This is a ${x.Brand} Computer with ${x.Cpu} CPU")
    else ->
      println(x)
  }
}

fun printUnsafeCast(x: Any): Unit {
  val value = x as String
  println(value)
}

fun printSafeCast(x: Any): Unit {
  val value : String? = x as? String
  println(value)
}