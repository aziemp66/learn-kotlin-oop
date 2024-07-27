package data.access_modifiers

class Principal : Teacher() {
  override var salary: Long = 3 * super.salary
  override var teacherID: String = super.teacherID
    set(value) {
      field = "${super.teacherID}-$value"
    }
}