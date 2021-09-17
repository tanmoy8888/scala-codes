package datatypes

/**
 * @author Tanmoy Mukherjee
 */

/**
 * Basic formatting
 */
object ScalaDataTypes {
  val floatData = 123.4567
  val addPadding = 123

  def main(args: Array[String]): Unit = {
    // Formatting floating point number
    println(f"Formatting float data $floatData%.2f")
    // Zero padding on the left  - It will make a 5 digit number
    println(f"Adding zero padding on the left $addPadding%05d")
    // Printing an expression using String interpolation
    println(s"Printing value of an expression :: ${4+2}")
  }

}
