import scala.io.StdIn.readLine

object TemperatureConvertor extends App {
  val celsius = readLine ("Please insert temperature in Celsius").toFloat
  println (s"$celsius would be ${(celsius*1.8+32).round/100.0} in Farenheit")
  val farenheit = readLine ("Please insert temperature in Farenheit").toFloat
  println (s"$farenheit would be ${((farenheit-32)/1.8).round/100.0} in Celsius")

}
