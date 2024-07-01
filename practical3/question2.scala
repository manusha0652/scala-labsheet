object ListOfStrings {
  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    println("Enter strings separated by spaces:")
    val input = scala.io.StdIn.readLine()
    val stringList = input.split(" ").toList
    val filteredList = filterLongStrings(stringList)

    if (filteredList.isEmpty) {
      println("No strings have more than 5 characters.")
    } else {
      println("Strings with more than 5 characters:")
      filteredList.foreach(println)
    }
  }
}
