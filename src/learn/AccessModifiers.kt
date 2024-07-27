package learn

import data.access_modifiers.Principal
import data.access_modifiers.Teacher

fun main() {
  val teacher = Teacher()
  teacher.subject = "math"
  teacher.teacherID = "math_001"

  println(teacher.subject)
  println(teacher.teacherID)

  val principal  : Principal = Principal()
  principal.teacherID = "principal_001"

  println(principal.teacherID)
}