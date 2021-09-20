package classExample.abstractClasses

/**
 * @author Tanmoy Mukherjee
 */
abstract class AbstractClassExample2(name:String) {
def display()
}

class AbstractClassExample2Impl(name:String) extends AbstractClassExample2(name){
  override def display(): Unit = {
    println(("My name is " + name))
  }
}

object RunnerObject1{
  def main(args: Array[String]): Unit = {
    val ex = new AbstractClassExample2Impl("Tanmoy Mukherjee")
    ex.display
  }
}