object ArithmeticMean {
  def mean(num1: Int, num2: Int): Double = {
    val avg = (num1 + num2) / 2.0
    BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  def main(args: Array[String]): Unit = {
    val num1 = 20
    val num2 = 10
    println("average is :"+mean(num1, num2)) 
  }
}
