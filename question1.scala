object practical9{

  def main(args: Array[String]): Unit={
  println("enter the deposit money :")
          val userinput=scala.io.StdIn.readLine()
          val interestAmount =interest(userinput.toDouble)
            println(s"the actual amount of interest is: $interestAmount")
   }

      def interest( deposit:Double):Double = {
          val interestRate:Double=>Double=deposit match{
          case d if d<=20000=> _=> 0.02
          case d if d<=200000=> _=> 0.04
          case d if d<=2000000=> _=>0.035
          case _=> _=>0.065
       }
           deposit *interestRate(deposit)

      }

  }  

