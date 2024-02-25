package collections

import scala.collection.mutable

object SuperHeroes {
  def main(args: Array[String]): Unit = {
    val avengers = Map("Iron Man" -> 12, "Black Widow" -> 18, "Captain America" -> 8, "Scarlet Witch" -> 10)

    val scarletWitch = avengers("Scarlet Witch")

    val ironMan = avengers.getOrElse("iron Man", 0)
//    println(avengers.keys)
//    println(avengers.values)

//    for((key, value) <- avengers) println(key + " : " + value)

//    for (value <- avengers.values) println(value)

    val mutableAvengers = mutable.Map("Iron Man" -> 12, "Black Widow" -> 18, "Captain America" -> 8, "Scarlet Witch" -> 10)

    mutableAvengers("Iron Man") = 9

    mutableAvengers("Hawkeye") = 19

    mutableAvengers -= "Captain America"

//    mutableAvengers.foreach(println)

    val hawkEye = ("Clint", "Waverly, Iowa", 'M')

    val hawkName = hawkEye._1
    val hawkBirthPlace = hawkEye._2

    println(hawkName)
    println(hawkBirthPlace)

    hawkEye.productIterator.foreach(println)
  }
}
