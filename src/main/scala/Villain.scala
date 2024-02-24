class Villain (name: String, birthPlace: String) extends SuperHero (name, birthPlace){
  println("A villian was created")

  override def details(): Unit = {
    println(name + " is a notorious villain.")
  }
}
