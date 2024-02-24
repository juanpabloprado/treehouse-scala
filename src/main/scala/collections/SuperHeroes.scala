package collections

import scala.collection.mutable.ArrayBuffer

object SuperHeroes {
  def main(args: Array[String]): Unit = {
    val numbers = new Array[Int](10)

    val words = new Array[String](10)

    val heroes = Array("Wonder Woman", "Thor", "Superman", "Batman")

//    println(heroes(3))

    val mutableHeroes = ArrayBuffer("Wonder Woman", "Thor", "Superman", "Batman")

    mutableHeroes += "Iron Man"

    val otherHeroes = Array("Spider-Man", "Hulk", "Starfire", "Green Arrow")

    mutableHeroes ++= otherHeroes
//    println(mutableHeroes)

    mutableHeroes.dropRightInPlace(2)

    mutableHeroes.update(1, "Flash")

//    println(mutableHeroes)

    for (elem <- mutableHeroes) println(elem)

//    for (i <- 1 until 10) println(i)

    for (i <- 1 to 10) println(i)

    for (elem <- mutableHeroes.indices) println(elem + " " + mutableHeroes(elem))

    val dashHeroes = for (elem <- mutableHeroes if elem.contains("-")) yield elem

    dashHeroes.foreach(println)
  }
}
