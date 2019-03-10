package lectures.part2oop

object Inheritance extends App {

  // single class inheritance
  class Animal {
    def creatureType = "wild"
    def eat = println("nomnom")
  }

  class Cat extends Animal  {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }// Cat is a subclass of Animal, and Animal is a super class of Cat

  val cat = new Cat
  cat.crunch

  // constructors
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal {
   // override def creatureType: String = "domestic"
    override def eat: Unit = {
        super.eat
        println("crunch, crunch")
     }
  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)


  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // know the difference between overRIDING and overLOADING

  // super

  // preventing overrides
  // 1 - use final on member
  // 2 - use final on the entire class
  // 3 - seal thew class = extend classes in THIS FILE, prevent extensions in other files


}
