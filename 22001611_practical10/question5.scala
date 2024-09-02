object LetterCounter {
  def countLetterOccurrences(words: List[String]): Int = {
  
    val wordLengths = words.map(_.length)

   
    val totalLetters = wordLengths.reduce(_ + _)

    
    totalLetters
  }

  def main(args: Array[String]): Unit = {
    val words = List("apple", "banana", "cherry", "date")
    val total = countLetterOccurrences(words)
    println("Total count of letter occurrences: "+total)
  }
}
