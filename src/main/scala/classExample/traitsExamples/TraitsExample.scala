package classExample.traitsExamples

/**
 * @author Tanmoy Mukherjee
 */

trait Animal{
  val typeOfAnimal ="Dog"
  def getAnimalType()
}

trait Dog{
  def getBreed()
  def dogCategory(): Unit ={
    println("This is a very friendly dog")
  }
}

trait Color{
  def getDogColour()
}

class TraitsExample extends Animal with Dog with Color {

  override def getAnimalType(): Unit = {
    println("Animal type is Dog")
  }

  override def getBreed(): Unit = {
    println("Dog breed is Siberian Husky")
  }

  override def getDogColour(): Unit = {
    println("The color of Dog is white with blue eyes")
  }
}

object TraitsRunner{
  def main(args: Array[String]): Unit = {
    val ex = new TraitsExample

    println("Type of animal is :: "+ex.typeOfAnimal)
    ex.getAnimalType
    ex.getBreed
    ex.getDogColour
    ex.dogCategory
  }
}
