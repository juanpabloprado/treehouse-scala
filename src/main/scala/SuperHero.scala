class SuperHero(val name: String, val nickname: String, val birthPlace: String,
                val gender: Char) {
  println("A new hero was created " + name)

  def this(name: String) = {
    this(name, "", "", ' ')
  }

  def this(name: String, birthPlace: String) = {
    this(name, "", birthPlace, ' ')
  }

  def details(): Unit = {
    println(" was born in " + birthPlace)
  }

  private var heroAge = 0

  def age: Int = heroAge

  def age_(newAge: Int): Unit = {
    if (newAge > heroAge)
      heroAge = newAge
    else
      heroAge
  }

}
