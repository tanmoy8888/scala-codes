package datastructures.sequence

/**
 * @author Tanmoy Mukherjee
 */
object ScalaSequence {

  val seq = Seq(1,2,3,4,5,6)
  def main(args: Array[String]): Unit = {
    /**
     * Printing elements of sequence
     */
    seq.foreach(print)
    println("\nPrinting index element in sequence :: "+seq(1))
    println(seq.head)
    println(seq.tail)
    println(seq.count(_ < 2))
    println(seq.reverse)
  }

}
