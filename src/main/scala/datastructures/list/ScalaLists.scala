package datastructures.list

/**
 * @author Tanmoy Mukherjee
 */
object ScalaLists {

  val strList = List("red", "blue", "yellow", "green")
  val reverseList = strList.map(_.reverse)
  val intList = List(1,2,3,4,7,9,6,8,5)
  val sumByReduce = intList.reduce(_ +_)


  def main(args: Array[String]): Unit = {
    strList.foreach(println)
    println(strList.head)
    println(strList.tail)
    /**
     * Using Map operation on List
     */
    println("Reversing List all elements ::  "+reverseList)
    /**
     * Reduce Operation on List
     */
    println("Reduce Operation on List :: "+sumByReduce)
    /**
     * Max , Min Values of List
     */
    println("Max and Min values of a list")
    println(intList.max)
    println(intList.min)
    println("Some utility method of list")
    println(intList.dropWhile(e =>(e % 2) != 0))
    println(intList.slice(1,4))
    println(intList.takeWhile(_ < 6))
    println(intList.sorted)
  }

}
