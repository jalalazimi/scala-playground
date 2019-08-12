object array {
  def main(args: Array[String]): Unit = {

    val companies: Array[String] = new Array[String](4)
    companies(0) = "Microsoft"
    companies(1) = "Google"
    companies(2) = "Apple"
    companies(3) = "Yahoo"

    for (i <- 0 to 2)
      println(companies(i))

    println(s"Length: ${companies.length}")
    println(s"Reverse: ${companies.reverse}")
    println(s"Head: ${companies.head}")
    println(s"Tail: ${companies.last}")
    println(s"is Empty: ${companies.isEmpty}")
    println(s"Known Size: ${companies.knownSize}")
    println(s"contains: ${companies.contains("Apple")}")

  }
}
