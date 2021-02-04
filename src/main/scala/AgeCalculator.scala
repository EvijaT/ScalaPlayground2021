import scala.io.StdIn.readLine

object AgeCalculator extends App {
  println("This program will calculate the year when you will be 100")
  //TODO ask for person's name
  //TODO ask for person's age
  //TODO calculate and display year when they will be 100 :)

  val myName = readLine("What is your name?")
  val myAge = readLine(s"Nice to meet you, $myName! How old are you?").toInt
  println(s"Random fact, $myName! The year you will turn 100 years old is ${100 - myAge +2021}!")


}
