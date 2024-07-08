object Q2 {
    def identifynum(): Unit = {
        println("Input a number")
        val input = scala.io.StdIn.readLine().toInt
        if (input <= 0) {
            println("Negative or Zero")
        } else if (input % 2 == 0) {
            println("This is Even number")
        } else {
            println("This is Odd number")
        }
    }

    def main(args: Array[String]): Unit = {
        identifynum()
    }
}
