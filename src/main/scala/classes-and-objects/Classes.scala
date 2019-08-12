class Dog {
  var isAnimal: Boolean = true
  private val name = "JoJo"
  def getName: String = name
}

object Dog {


}


object Classes {
  def main(args: Array[String]): Unit = {

    val dog = new Dog
    println(dog.isAnimal)
    println(dog.getName)

  }
}
