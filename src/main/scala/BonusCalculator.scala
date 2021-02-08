import scala.io.StdIn.readLine

object BonusCalculator extends App {
  //TODO Calculate yearly Xmas Bonus
  //Ask for Employee Name
  val employee = readLine("What is your name? ")
  val monthlyWage = readLine(s"Nice to talk to you $employee! What is your monthly wage? ").toLong
  val employment = readLine("How many years have you worked with us? ").toInt

  if (employment > 2) {
    println(s"Congratulations, $employee, your Christmas bonus this year is ${monthlyWage*0.15*(employment-2)} euro!")
  } else if (employment < 2) {
    println(s"$employee, you can receive Cristmas bonus after ${2-employment} year!")
  } else {
    println(s"Congratulations, $employee, your Christmas bonus this year is ${monthlyWage*0.15} euro!")
  }

  //Ask for how long they have worked
  //ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus
}
