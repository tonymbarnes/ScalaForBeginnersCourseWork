package lectures.part1basics

object FunctionsPracticeForInterview extends App {

  def aGreeting(name: String, age: Int): String = {
    s"Hello my name is $name and I am $age years old."
  }

  println(aGreeting("Tony", 26))

  def aFactorial(n: Int): Int ={
    if (n <= 1) 1
    else n * aFactorial(n-1)
  }

  println(aFactorial(5))

  def fibonacci(n: Int): Int = {
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  println(fibonacci(0))
  println(fibonacci(3)) // 3
  println(fibonacci(5)) // 5
  println(fibonacci(6)) // 8
  println(fibonacci(7)) // 13
  println(fibonacci(8)) // 21

  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

     isPrimeUntil(n / 2)
  }

  println(isPrime(13))
  println(isPrime(4))
  println(isPrime(2003))
  println(isPrime(2))
}
