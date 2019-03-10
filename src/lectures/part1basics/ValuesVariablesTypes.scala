package lectures.part1basics

object ValuesVariablesTypes extends App{

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER CAN INFER TYPES

  val aString: String = "Hello"
  val antoherString = "Goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: Int = x
  val aShort: Short = 4316
  val aLong: Long = 579847592487520L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // VARIABLES

  var aVariable: Int = 4

  aVariable = 5// side effects


}
