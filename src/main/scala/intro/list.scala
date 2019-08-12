object list {
  def main(args: Array[String]): Unit = {

    val list = List(1,2,3,4)
    println(list)

    val thrill =  "Will" :: "fill" :: "until" :: Nil
    println(thrill)

    println(s"Concat: ${ thrill ::: list}")
    println(s"item #3: ${ thrill(2)}")
    println(s"Counts the number: ${ thrill.count(s => s.length == 4)}")
    println(s"pop list: ${ thrill.drop(2)}")

  }
}
