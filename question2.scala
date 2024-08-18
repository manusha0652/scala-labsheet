object question2{

    def main(args: Array[String]): Unit={
        println("Enter the integer :")
        val input=scala.io.StdIn.readLine()
         val value=input.toInt
           integer(value)
         }

       def integer(value:Int):Unit={
           value match{
            case d if d<=0 =>println("Negative/Zero" )
            case d if d %2==0 =>println("Even number")
            case d if d %2!=0 =>println("odd number")
            case _ => println("invalid value")
           }
    }    

}