object StringFormatter {

  
  def toUpper(name: String): String = {
    name.toUpperCase()
  }

  
  def toLower(name: String): String = {
    name.toLowerCase
  }

 
  def formatNames(name: String)(formatter: String => String): String = {
    formatter(name)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    
    println(formatNames(names(0))(toUpper))              

       println(formatNames(names(1))(name => name.substring(0, 2).toUpperCase + name.substring(2)))

    println(formatNames(names(2))(toLower))            

    println(formatNames(names(3))(name=>name.substring(0, 1).toUpperCase + name.substring(1, 5).toLowerCase + name.substring(5).toUpperCase))  
  }
}
