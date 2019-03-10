package lectures.part3fp

object AnonymousFunctions extends App {

//  val doubler = new MyFunction[Int, Int] {
//    override def apply(element: Int): Int = element * 2
//  }

  // This ^^ is the same as below
  // anonymous function (LAMBDA)
  // val doubler = (x: Int) => x *2
  val doubler: Int => Int = x => x * 2

  println(doubler(3))

  // multiple parameters in Lambda
  val adder: (Int, Int) => Int = (x, y) => x + y

  println(adder(3,4))

  // no parameters
  val justDoSomething: () => Int = () => 3

  println(justDoSomething) // function itself
  println(justDoSomething()) // call

  // curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MOAR syntactic sugar
  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _ // equivalent to (a, b) => a + b

  /*
    1. MyList: Replace all FunctionX with lambdas
    2. Rewrite the "special" adder as an anonymous function
   */

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3)(5))

}