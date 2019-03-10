//package lectures.part4pm
//
//object AllThePatterns extends App {
//
//  // 1- constants
//  val x: Any = "Scala"
//  val contants = x match {
//    case 1 => "a number"
//    case "Scala" => "THE Scala"
//    case true => "The truth"
//    case AllThePatterns => "A singleton object"
//  }
//
//  // 2 - match anything
//  // 2.1 - wildcard
//  val matchAnything = x match {
//    case _ =>
//  }
//
//  // 2.2 variable
//  val matchAVariable = x match {
//    case something => s"I've fouond $something"
//  }
//
//  // 3 - Tuples
//  val aTuple = (1, 2)
//  val matchATuple = aTuple match {
//    case (1,1) =>
//      case(something, 2)
//  }
//
//  // PMs can be nested
//
//  // 4 - case class - constructor pattern
//    // PM can be nested with case classes as well
//
//  // 5 - List patterns
//  val aStandardList = List(1,2,3,42)
//  val standardListMatching = aStandardList match {
//    case List(1, _, _, _) => // extractor - advanced
//    case List(1, _*) => // List of arbitrary length - advanced
//    case 1 :: List(_) => // infix pattern
//    case List(1,2,3) :+ 42 => // infix pattern
//  }
//
//  // 6- type specifiers
//  val unknown: Any = 2
//  val unknownMatch = unknown match {
//    case List: List[Int] => // explicit type specifier
//    case _ =>
//  }
//
//  // 7 - name binding
//  val nameBindingMatch =
//
//  // 8 - multi-patterns
//
//  // 9 - if gaurds
//  val secondElementSpecial = aList match {
//    case Cons(_, )
//  }
//
//}
