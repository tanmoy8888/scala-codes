package datastructures.set

/**
 * @author Tanmoy Mukherjee
 */
object ScalaSets {

  val set =Set(1,4,3,2,6,5)

  def main(args: Array[String]): Unit = {
    /**
     * Differenr functions of Set
     */
    set.foreach(print)
    println("\nHead element in set :: "+set.head)
    println(set.tail)
    println(set.count(_ < 4))

  }

}
