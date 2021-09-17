package programming.`class`

class ScalaClassApply(val name:String, val title:String) {
  println("This is from class")
  def this(name:String) = this(name,"Mukherjee")
  override def toString: String = s"name $name , title $title"
}

object ScalaClassApply{
  def apply(name:String,title:String): Unit ={
    new ScalaClassApply(name,title)
  }
  def apply(name:String): Unit ={
    new ScalaClassApply(name,"Mukherjee")
  }
  def main(args: Array[String]): Unit = {
    val demo1 = ScalaClassApply("Tanmoy")
   // println("name is :: "+demo1)
    val demo2 =ScalaClassApply("Tanmoy")
    println(demo2)
  }
}
