object FlowControl {

  def flowControlCheck(): Unit ={
    if(1 > 2) println("1 is bigger") else println("2 is bigger")
  }
  def patterMatching(i:Int):String={
    i match {
      case 1 => "Red"
      case 2 => "Blue"
      case 3 => "Yellow"
      case 4 => "Green"
      case _ => "Sorry !! no match found"
    }
  }

  def main(args: Array[String]): Unit = {
    flowControlCheck()
    println("Checking Pattern Matching :: "+patterMatching(2))
  }

}
