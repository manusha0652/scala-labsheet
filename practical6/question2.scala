object question2 {
  def main(args: Array[String]): Unit = {
    val studentRecord = getStudentInfoWithRetry()
    printStudentRecord(studentRecord)
  }

  def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
    var isValid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')

    while (!isValid) {
      println("Enter the name:")
      val name = scala.io.StdIn.readLine()

      println("Enter the marks:")
      val marks = scala.io.StdIn.readInt()

      println("Enter the total possible marks:")
      val totalMarks = scala.io.StdIn.readInt()

      val validationResult = validateInput(name, marks, totalMarks)
      isValid = validationResult._1
      if (isValid) {
        studentInfo = getStudentInfo(name, marks, totalMarks)
      } else {
        println(validationResult._2.getOrElse("Invalid input"))
      }
    }

    studentInfo
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isEmpty) {
      return (false, Some("Name cannot be empty"))
    }

    if (marks < 0 || totalMarks <= 0 || marks > totalMarks) {
      return (false, Some("Marks should be positive and less than or equal to total marks"))
    }

    (true, None)
  }

  def getStudentInfo(name: String, marks: Int, totalMarks: Int): (String, Int, Int, Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _            => 'D'
    }
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    println(s"Student Name: ${record._1}")
    println(s"Marks: ${record._2} / ${record._3}")
    println(f"Percentage: ${record._4}%.2f %%")
    println(s"Grade: ${record._5}")
  }
}
