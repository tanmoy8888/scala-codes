package functions

/**
 * @author Tanmoy Mukherjee
 */

/*
 function Syntax :
  def <function name> (input parameters) : return type = {function body}
 */

object ScalaFunctions {

  def hello(str:String) = println(s"hello $str , how are you doing today !!")
  def square(i:Int):Int=i*i
  def passingFunction(i:Int,myFunc:Int => Int):Int ={
    myFunc(i)
  }
  def recursiveFunction(i:Int):Int = if(i==0) 1 else i*recursiveFunction(i-1)
  def sum(i:Int,j:Int=2):Int = i+j
  def division(i:Int,j:Int):Int = i/j
  val divReverse = division(j=10,i=100)
  def primaryFunction(i:Int)={
    def secondaryFunction(i:Int): Unit ={
      if((i%2)==0) println("This is a even number") else println("This is a odd number")
    }
    secondaryFunction(i)
  }
  val annonymousFunction = (s:String) => s.toUpperCase()
  def multiInput(args:Int*):Int = {
    var result =1;
    for(i <- args){
    result = result *i
    }
    result
  }
  val j:Int = 10
  val clousureFunction = (i:Int) => i+j


  def main(args: Array[String]): Unit = {

    hello("Tanmoy")
    // passing function as input parameter - Higher Order Function
    println("Passing function as input parameter :: "+passingFunction(4, square))
    // Recursion
    println("Recursive Function :: "+recursiveFunction(4))
    // Default value in function parameter
    /**
     * This default parameter should be the last value of a function input parameter
     */
    println("Default value in function parameter :: "+sum(4))
    println("Overriding default value in function parameter :: "+sum(4,5))
    // Named Parameter
    /**
     * When we have to change the values of the input parameter with the given name of a function
     */
    println("Named Parameter :: "+divReverse)
    // Nested Function
    /**
     * A function inside a function
     */
    primaryFunction(10)
    /**
     * Anonymous Function - A function which does not have a name - lambda function
     */
    println("Anonymous Function :: "+annonymousFunction("Tanmoy Mukherjee"))
    /**
     * Multi Input parameter of a function
     */
    println("Multi Input parameter of a function :: "+multiInput(1, 2, 3, 4))

    /**
     * Closure - When a function return type is depends on a varible which is present outside the scope of the function
     */
    println("Closure Function :: "+clousureFunction(5))
  }


}
