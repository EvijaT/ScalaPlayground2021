import scala.io.StdIn.readLine

object TemperatureTester extends App {
  //TODO write a program which asks for user's temperature
  //if Temperature is over 37C print a warming about high temperature
  //if temperature is under 35 print a warning about being cold
  //otherwise print that everything is great :0
  val bodyTemperature = readLine ("Please, enter your body temperature ").toFloat
  if (bodyTemperature > 37) {
    println("Your temperature is too high, please see your doctor!")
  } else if (bodyTemperature < 35) {
    println("Your temperature is too low, please see your doctor!")
  } else {
    println("Your temperature is fine!")
  }

}