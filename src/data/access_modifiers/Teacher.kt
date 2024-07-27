package data.access_modifiers

import java.util.*

open class Teacher {
  public var subject : String? = null
    get()  {
      if (field != null) return field
      else return ""
    }
    set(value) {
      if (value != null)
      field = value.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    }

  private fun teach() {
    println("Teaching")
  }

  protected open var salary : Long = 3_000_000

  internal open var teacherID = "teacher_00"
}