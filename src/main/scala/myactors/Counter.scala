package myactors

import akka.actor._

case object Greeting

class Counter extends Actor {
  def counter(n: Int): Receive = {
    case "incr" => context.become(counter(n+1))
    case "get" => {
      println(s"$n")
    }
  }
  def receive = counter(0)
}
