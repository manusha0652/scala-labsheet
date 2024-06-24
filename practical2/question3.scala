object Question3 {
  def main(args: Array[String]): Unit = {
    take_home_salary(40, 30)
  }

  def take_home_salary(working_hours: Int, OT_hours: Int): Unit = {
    val full_salary = working_hours * 250 + OT_hours * 85
    val tax = full_salary * 12 / 100
    val net_salary = full_salary - tax
    println("Take home salary is: " + net_salary)
  }
}
