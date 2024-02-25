package functions


object SuperHeroes {
  def main(args: Array[String]): Unit = {

    val heroes = Array("Wonder Woman", "Thor", "Superman", "Batman")

    val lowerC = (value: String) => value.toLowerCase

//    for (elem <- heroes) {
//      println(lowerC(elem))
//    }

    def updateRankings(x: Int) = x - 3

//    (x: Int) => x - 3

    val avengers = Map("Iron Man" -> 12, "Black Widow" -> 18, "Captain America" -> 8, "Scarlet Witch" -> 10)

    val newRankings = avengers.values.map((x: Int) => x - 3)

//    newRankings.foreach(println)

    def multiply(x: Int, y: Int, z: Int) = x * y * z

    val result = multiply(1, 2, 3)
//    println(result)

    val someResult = multiply(1, 2, _:Int)
//    println(someResult(3))

    val nonResult = multiply
//    println(nonResult(1, 2, 3))

    def add(x: Int) = (y: Int) => x + y
//    val sum = add(8)
//    println(sum(2))

//    println(add(2)(8))

    def addition(x: Int)(y: Int) = x + y

//    println(addition(10)(12))

//    heroes.foreach(println)
    val lHeroes = heroes.map(data => data.toLowerCase)

    val lHeroes1 = heroes.map(_.toLowerCase)
//    lHeroes.foreach(println)

//    val man = heroes.filter(_.contains("man"))
//    man.foreach(println)

    val man = heroes.filter(_.contains("man")).map(_.toUpperCase)

    man.foreach(println)

    val numbers = Array(1,2,3,4,5,4,4,3,5)

    val less = numbers.dropWhile(_ < 3)
//    less.foreach(println)

    val howMany = numbers.count(_ <= 4)
//    println(howMany)

    val isItInThere = numbers.indexWhere(_ == 3)
    println(isItInThere)

    val ironManR = avengers.getOrElse("Iron Man", 0)
    val blackWidowR = avengers.getOrElse("Black Widow", 0)
    val captainAmericaR = avengers.getOrElse("Captain America", 0)

    def compare(avenger1: Int, avenger2: Int, avenger3: Int,
                f: (Int, Int, Int) => Int) = f(avenger1, avenger2, avenger3)

    val bestRanked = compare(ironManR, blackWidowR, captainAmericaR, _ min _ min _)
//    println(bestRanked)

    val worstRanked = compare(ironManR, blackWidowR, captainAmericaR, _ max _ max _)
    println(worstRanked)
  }
}
