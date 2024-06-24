object Question2 {
  def main(args: Array[String]): Unit = {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f
    var g: Float = 0.0f 

  
    // a) println( - -b * a + c * d - -); 
    //decrement b before printing
    b-=1
    val exprA =b * a + c * d
    println("Answer of question (a) is: "+exprA)
    d-=1//decrement d after printing

    // b) println(a++);
    println("Answer of question (b) is: "+a)
    a += 1 // Increment a after printing

    // c) println(–2 * ( g – k ) + c);
    val exprC = -2 * (g - k) + c
    println("Answer of question (c) is: "+exprC)

    // d) println (c=c++);
    println(s"Answer of question (d) is: "+c) 

    // e) println (c=++c*a++);
    c += 1 //Increment c before printing
    val exprE = c * a
    println(s"Answer of question (e) is: $exprE")
    a += 1 // Increment a after using it in the expression
  }
}
