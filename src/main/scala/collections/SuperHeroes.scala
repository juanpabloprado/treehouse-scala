package collections

import scala.collection.mutable.ListBuffer

object SuperHeroes {
  def main(args: Array[String]): Unit = {
    val immutableHeroes = List("Wonder Woman", "Thor", "SuperMan", "Batman")
    val numbers = 1::2::3::Nil
    println(immutableHeroes.head)
    println(immutableHeroes.tail)

    val readableHeroes = immutableHeroes.mkString(" | ")

    val prettifyHeroes = immutableHeroes.mkString("[", ", ", "]")

    println(prettifyHeroes)

    val mutableHeroes = ListBuffer("Wonder Woman", "Thor", "SuperMan", "Batman")

    mutableHeroes += "Raven"

    "Captain America" +=: mutableHeroes

//    mutableHeroes.foreach(println)

    val captainAmerica = mutableHeroes.head

    mutableHeroes(2) = "Iron Man"
//    mutableHeroes.foreach(println)

    mutableHeroes -= "Batman"

    mutableHeroes.remove(0)

    mutableHeroes.foreach(println)
  }
}
