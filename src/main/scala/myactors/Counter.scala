package myactors

import akka.actor._

case object Greeting

class Counter extends Actor {

  //var count = 0
  def receive = {
    case Greeting => println("hello from actor")
    //case "incr" => count += 1
    //case "get" => sender ! count
  }
}
