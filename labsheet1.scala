object AllQuestions {
  import scala.math.Pi

  def main(args :Array[String]): Unit = {
    // Question 1
    calculate_Disk_Area(5)
    
    // Question 2
    convert_Celsius_To_Fahrenheit(35)
    
    // Question 3
    calculate_Sphere_Volume(5)
    
    // Question 4
    calculate_BookPrice(60) 
    
    // Question 5
   
    printf("Total Running Time: %.2f minutes\n", totalRunningTime(4.0, 3.0))
  }

  // Question 1: Calculate area of a disk
  def calculate_Disk_Area(radius: Double): Unit = {
    val area = Pi * radius * radius
    printf("Area of the disk is %.2f\n", area)
  }

  // Question 2: Convert Celsius to Fahrenheit using printf
  def convert_Celsius_To_Fahrenheit(C: Double): Unit = {
    val F = C * 1.8000 + 32.00
    printf("%.0f°C temperature in Fahrenheit is %.2f\n", C, F)
  }

  // Question 3: Calculate volume of a sphere
  def calculate_Sphere_Volume(r: Double): Unit = {
    val volume = 4.0 / 3.0 * Pi * r * r * r
    printf("Volume of the sphere is %.2f\n", volume)
  }

  // Question 4: Calculate total book price with 40% discount and shipping
  def calculate_BookPrice(numBooks: Int): Unit = {
    val bookPrice = 24.95
    val discountPercent = 40
    val discount = bookPrice * discountPercent / 100
    val discountedPricePerBook = bookPrice - discount
    val totalBookPrice = discountedPricePerBook * numBooks
    val totalShippingCost = shippingCost(numBooks)
    val finalPrice = totalBookPrice + totalShippingCost
    printf("Total price of %d books with 40%% discount: %.2f\n", numBooks, finalPrice)
  }

  
  def shippingCost(num: Int): Double = {
    val cost = 3.0
    val extraCost = 0.75
    val limit = 50
    if (num <= limit) cost * num
    else limit * cost + (num - limit) * extraCost
  }

  // Question 5: Calculate total running time
  def easyPaceTime(kms: Double): Double = 8.0 * kms
  
  def tempoPaceTime(kms: Double): Double = 7.0 * kms
  
  def totalRunningTime(easyPaceKms: Double, tempoPaceKms: Double): Double = {
    easyPaceTime(easyPaceKms) + tempoPaceTime(tempoPaceKms)

  }
}
