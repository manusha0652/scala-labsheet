object StringFormatter {
 
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

 
  def toLower(name: String): String = {
    name.toLowerCase()
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }

  def main(args: Array[String]): Unit = {
 
    println(formatNames("Benny")(toUpper))       
    println(formatNames("Niroshan")(name => {
      val firstTwo = name.substring(0, 2).toUpperCase
      val rest = name.substring(2).toLowerCase
      firstTwo + rest
    })) 
    println(formatNames("Saman")(toLower))       
    println(formatNames("Kumara")(name => {
      val firstFive = name.substring(0, 5).toLowerCase
      val lastOne = name.substring(5).toUpperCase
      firstFive + lastOne
    })) 
  }
}
