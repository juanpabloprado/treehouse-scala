def multipliedByTwo(x: Int): Int = if (x == 0) x else x * 2

def multiplyByTen(x: Double = 10, y: Double): Double = {
  x * y
}

multiplyByTen(y = 5)

def greeting(): Unit = println("Hello World!")

greeting()

def factorial(x: Int): Int = {
  if (x == 0 || x == 1)
    x
  else
    x * factorial(x - 1)
}

for (i <- 1 to 10) println(i)

for (i <- 1 until 10) println(i)

for (i <- 1 to 10 if i % 2 == 0)
  println(i)

val numbers = for (i <- 1 to 10) yield i * 10
numbers

val age = 20

age match
  case 10 => println("ten")
  case 20 => println("twenty")
  case _ => println("Did not find a match")

def findAge(age: Int): String = age match {
  case 10 => "ten"
  case 20 => "twenty"
  case _ => "Did not find a match"
}

val ageAsString = findAge(20)

println(ageAsString)