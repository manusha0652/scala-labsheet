object StringReversal {
  def reverseString(str: String): String = {
    if (str.isEmpty || str.length == 1) str
    else{ str.last + reverseString(str.init)
  }
  }

  def main(args: Array[String]): Unit = {
    val input = scala.io.StdIn.readLine("Enter a string: ")
    val reversed = reverseString(input)
    println("Original string is : " + input)
    println("Reversed string is: " + reversed)
  }
}
