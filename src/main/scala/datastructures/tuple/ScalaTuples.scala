package datastructures.tuple

/**
 * @author Tanmoy Mukherjee
 */
object ScalaTuples {

  val tuple1 = ("red", "blue", "yellow", "green")
  val tupleOfMap = ("A" -> "Apple", "B" -> "Ball")
  val multiDataTypeTuple = ("Tanmoy", true, 10, 2.4, "Mukherjee", 20)
  def multiTupleImpl = multiDataTypeTuple.productIterator.foreach(println)
  def getElementFromTuple(i: Int) = multiDataTypeTuple.productElement(i)

  def main(args: Array[String]): Unit = {
    /**
     * Basic Tuple in Scala
     */
    println("Tuple in Scala :: " + tuple1)
    println(tuple1._1)
    println(tuple1._2)
    println(tuple1._3)
    println(tuple1._4)
    /**
     * Tuple of Map in Scala
     */
    println("Tuple of Map in Scala :: " + tuple1)
    println(tupleOfMap._1._1)
    println(tupleOfMap._1._2)
    println(tupleOfMap._2._1)
    println(tupleOfMap._2._2)
    /**
     * Scala Tuple can contains multiple data types
     */
    println("Multi tuple in Scala :: ")
    multiTupleImpl
    println("Printing data from tuple on basis of Index position :: " + getElementFromTuple(2))
  }
}
