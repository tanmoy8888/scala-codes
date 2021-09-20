package classExample.abstractClasses

/**
 * @author Tanmoy Mukherjee
 */
abstract class AbstractClassExample1 {
  val name="Tanmoy"
  def display()
}

class AbstractClassImpl extends AbstractClassExample1{
  override def display(): Unit = {
    println(("Hi my name is " + name))
  }
}
object RunnerObject{
  def main(args: Array[String]): Unit = {
    val ex = new AbstractClassImpl
    ex.display
  }
}