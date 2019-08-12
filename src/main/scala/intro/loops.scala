// Run code like following command:
// scala loops.scala Scala language
object loops {
  def main(args: Array[String]): Unit = {
    // Loop with while; decide with if
    var i = 0
    while (i < args.length) {
      if (i != 0)
        print(" ")
      print(args(i))
      i += 1
    }
    println()

    // Iterate with foreach
    args.foreach(println)

    // Iterate with for
    for (arg <- args)
      println(arg)
  }
}
