package functions


object SuperHeroes {
  def main(args: Array[String]): Unit = {
    var prefix = "Lighting "

    def reverseIt(name: String) = (name + prefix).reverse

    val thor = reverseIt("Thor")

    prefix = "Super Fast "

    val wonderWoman = reverseIt("Wonder Woman")

    println(thor)
    println(wonderWoman)
  }
}
