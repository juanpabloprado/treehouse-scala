package collections

import scala.collection.mutable

object SuperHeroes {
  def main(args: Array[String]): Unit = {
    val numbers = Set(1,2,3,4,5)

//    numbers.foreach(println)

    val orderedSet = mutable.LinkedHashSet(10, 11, 12, 13, 14)

//    orderedSet.foreach(println)
    val nums = mutable.Set(4, 5, 10, 12, 13)

    nums += 4
    nums -= 5

    nums.foreach(println)

    val unionResult = numbers.union(nums)
    val intersectResult = numbers.intersect(nums)

    println(unionResult)
    println(intersectResult)
    
    
  }
}
