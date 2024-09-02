class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero") 

  private val g = gcd(n.abs, d.abs) 
  val numer: Int = n / g 
  val denom: Int = d / g 

  
  def neg: Rational = new Rational(-numer, denom)

 
  def sub(that: Rational): Rational = {
    new Rational(
      this.numer * that.denom - that.numer * this.denom,
      this.denom * that.denom
    )
  }

  
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString: String = s"$numer/$denom"
}

object Main {
  def main(args: Array[String]): Unit = {
    
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

   

    val negX = x.neg 
    println("Negation of x (3/4): " + negX) 

     val result = x.sub(y).sub(z) 
    println("Result of xy - z: " + result) 
  }
}
