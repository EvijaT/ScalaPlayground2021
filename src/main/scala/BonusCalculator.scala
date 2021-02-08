import scala.io.StdIn.readLine

object BonusCalculator extends App {
  //TODO Calculate yearly Xmas Bonus
  //Ask for Employee Name
  val employee = readLine("What is your name? ")
  val monthlyWage = readLine(s"Nice to talk to you $employee! What is your monthly wage? ").toFloat
  val employment = readLine("How many years have you worked with us? ").toFloat
val minYears = 2

  if (employment > minYears) {
    println(s"Congratulations, $employee, your Christmas bonus this year is ${monthlyWage*0.15*(employment.round-minYears)} euro!")
  } else if (employment < minYears) {
    println(s"$employee, try to apply for Christmas bonus next time!")
  } else {
    println(s"Congratulations, $employee, your Christmas bonus this year is ${monthlyWage*0.15} euro!")
  }

  //Ask for how long they have worked
  //ask for monthly wage
  //Calculate Xmas bonus if they have worked at least 2  years
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus
}
