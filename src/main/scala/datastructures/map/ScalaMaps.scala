package datastructures.map

import scala.util.Try

/**
 * @author Tanmoy Mukherjee
 */
object ScalaMaps {

  val map = Map("A"->"Apple","B"->"Ball","C"->"Cat","D"->"Dog")
  val myMap = Map("A"->"Apple","B"->"Ball","C"->"Cat","D"->"Dog")
  val mynewMap = Map("E"->"Red","F"->"Blue","G"->"Yellow","H"->"Green")

  def main(args: Array[String]): Unit = {
    /**
     * Get elemenet from map using the key
     */
    println("Get elemenet from map using the key :: "+map.get("A"))
    /**
     * Check a value is present in the map or not - It will return boolean value
     */
    println(map.get("D"))
    /**
     * Fetch using Try
     */
    println(Try(map.get("A")).getOrElse("No key found in the map"))
    val data = Try(map.get("E")).getOrElse("No key found in the map")
    println(data)
    /**
     * Map with default value
     */
    myMap.withDefaultValue("X"->"Sorry !! no key matches , this is default response from map")
    println("Default value from map :: "+myMap.get("X "))
    /**
     * Utility operations on Map
     */
    println(myMap.count(_._2 == "Apple"))
    val m1 = Map(1->"One",2->"Two")
    println(m1.count(_._2 == "Two"))
    println("Converting Map to String :: "+myMap.mkString(":"))
    println("Map Concatination of two maps having same type")
    println((map ++ mynewMap))


  }

}
