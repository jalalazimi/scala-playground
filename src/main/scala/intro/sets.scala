
import scala.collection.{immutable, mutable}

object sets {
  def main(args: Array[String]): Unit = {

    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet)
    println(jetSet.contains("Cessna"))


    val movieSet = mutable.Set("Hitch", "Poltergeist","Poltergeist")
    movieSet += "Shrek"
    println(movieSet)

    val HashSetMovieSet = mutable.HashSet("Hitch", "Poltergeist")
    HashSetMovieSet += "Shrek"
    println(HashSetMovieSet)


    val movies = immutable.Set("Hitch", "Poltergeist")
    println(movies)

    val HashSetMovies = immutable.HashSet("Hitch", "Poltergeist")
    println(HashSetMovies)

  }
}
