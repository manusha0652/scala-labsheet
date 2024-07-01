object EvenSum {
  def sumOfEvens(nums: List[Int]): Int = {
    nums.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    println("sum is :"+sumOfEvens(numbers)) 
  }
}
