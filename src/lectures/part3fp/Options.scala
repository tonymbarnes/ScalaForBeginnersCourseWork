package lectures.part3fp

import java.util.Random

object Options extends App {

  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption)
  println(noOption)

  // WORK with unsafe APIs
  def unsafeMethod(): String = null
  //   val result = Some(null) // WRONG
  val result = Option(unsafeMethod()) // will build Some or None

  println(result)

  // chained methods
  def backUpMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backUpMethod()))

  // DESIGN unsafe APIs
  def betterUnsafeMethod(): Option[String] = None
  def betterBackUpMethod(): Option[String] = Some("A valid result")
  val betterChainedResult = betterUnsafeMethod() orElse betterBackUpMethod()

  // functions on Options
  println(myFirstOption.isEmpty)
  println(myFirstOption.get) // UNSAFE - DO NOT USE THIS

  // map, flatMap, filter
  println(myFirstOption.map(_ * 2))
  println(myFirstOption.filter(x => x > 10))
  println(myFirstOption.filter(x => x > 2))
  println(myFirstOption.flatMap(x => Option(x * 10)))

  // for-comprehensions
  /*
    Exercise.
   */
  val config: Map[String, String] = Map {
    // fetched from elsewhere
    "host" -> "176.45.36.1"
    "port" -> "80"
  }

  class Connection {
    def connect = "Connected" // connect to some server
  }

  object Connection {
    val random = new Random(System.nanoTime())

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }

  // try to establish a connection, if so - print the connect method
  val host = config.get("host")
  val port = config.get("port")
  val connection = host.flatMap(h => port.flatMap(p => Connection.apply(h, p)))
  val connectionStatus = connection.map(c => c.connect)
  println(connectionStatus)
  connectionStatus.foreach(println)

// !!!! Did not finish writing the rest of the lecture on this one, deals with chained methods and for-comprehension feel free
}
