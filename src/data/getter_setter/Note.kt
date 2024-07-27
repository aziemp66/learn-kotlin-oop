package data.getter_setter

class Note(title: String) {
  var title: String = title
    get() = field
    set(value) {
      if (value.isNotBlank()) field = value
    }

  val upperCaseTitle: String
    get() = title.uppercase()
}