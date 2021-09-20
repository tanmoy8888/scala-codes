package classExample.companionObjects

/**
 * @author Tanmoy Mukherjee
 */
class ScalaCompanionObjectExample {
  ScalaCompanionObjectExample.getName
  AnotherObject.display
}

object ScalaCompanionObjectExample{
  val name="Tanmoy"
  val title="Mukherjee"

  private def getName(): Unit ={
    println(name + " " + title)
  }
}

object AnotherObject{
  def display: Unit ={
    println("This is from another object in same sourece file")
  }
}

object RunnerObject{
  def main(args: Array[String]): Unit ={
    val ex= new ScalaCompanionObjectExample
  }

}
