object SuperHeroes {
  def main(args: Array[String]): Unit = {
    println("Hello, world!")

    val superman = new SuperHero("Superman", "Clark Kent", "Krypton", 'M')

    val batman = new SuperHero("Batman")

    val spiderMan = new SuperHero("Spider-Man", "New York")

    val hulk = new SuperHero("Hulk", "Robert Bruce Banner", "Dayton, Ohio", 'M')

    hulk.age_(30)

    println(hulk.age)

    case class PowerStats(strength: Int, speed: Int)

    val wonderWoman = PowerStats(97, 78)

    val thor = PowerStats(100, 80)

    def findHero(power: PowerStats) = power match {
      case PowerStats(100, 80) => "Thor"
      case PowerStats(97, 78) => "Wonder Woman"
      case PowerStats(_, _) => "Match was not found"
    }

    val hero = findHero(PowerStats(100, 80))

    println(hero)

    val loki = new Villain("Loki", "Asgard")
    loki.details()
    loki.age_(26)
  }
}
