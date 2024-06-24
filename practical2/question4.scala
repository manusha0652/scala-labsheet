object Question4 {
  def main(args: Array[String]): Unit = {
    
   println( "profit when ticket price is 5 :"+profit(5))
   println("profit when ticket price is 10 :"+profit(10))
   println("profit when ticket price is 15 :"+profit(15))
   println("profit when ticket price is 20 :"+profit(20))
   println("profit when ticket price is 25 :"+profit(25))
   println("profit when ticket price is 30 :"+profit(30))
   println("profit when ticket price is 35 :"+profit(35))
   
   
  }

  def attendance(price: Double): Double = {
    120 + 20 * ((15 - price) / 5)
  }

  def revenue(price: Double): Double = {
    price * attendance(price)
  }

  def totalCost(price: Double): Double = {
    500 + 3 * attendance(price)
  }

  def profit(price: Double): Double = {
    revenue(price) - totalCost(price)
  }


}
