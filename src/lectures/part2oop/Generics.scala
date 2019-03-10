package lectures.part2oop

object Generics extends App {

  class MyList[A] {
    // use the type A

  }

  class MyMap[Key, value]
    val listOfIntegers = new MyList[Int]
    val listOfStrings = new MyList[String]

  // Generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }

  val emptyListOfIntegers = MyList.empty[Int]

  // variance problem

  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1. yes, List[Cat] extends List[Animal] = COVARIANCE
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // animalList.add(new Dog) ??? HARD QUESTION.

  // 2. No, INVARIANCE
  class InvariantList[A]

}
