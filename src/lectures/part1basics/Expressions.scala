package lectures.part1basics

object Expressions extends App {

  val x = 1 +2 // EXPRESSIONS
  println(x)

  println(2+ 3 * 4)
  // + - * / & | (or) ^(exclusive or) << >> >>> (right shift with zero extension)

  println(x == 1)
  // == (Equality) != (Non-equality) > >= < <=

  println(!(x == 1))
  // ! && ||

  var aVariable = 2
  aVariable += 3 //also works with -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions (Value)

  // IF expressions
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF Expression not if instruction
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN .

  //EVERYTHING in scala is an expression!
  val aWeirdValue = (aVariable = 3) // Unit === void
  println(aWeirdValue)

  // Side effects: println(), whiles, reassigning

  // Code Blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
println(aCodeBlock)


  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    // 42
  }
  println(someOtherValue)

}

