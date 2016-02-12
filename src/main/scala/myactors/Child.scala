package myactors

import akka.actor.Actor
import myactors.Child._
import scala.util.Random

object Child {
  case class TestStudent()
  case class Done()
  case class Failed()
}

class Child extends Actor {

  var testScore = 0
  def testChild: Int = math.abs(Random.nextInt(101))

  def receive = {

    case TestStudent    =>
      testScore = testChild
      while (testScore < 80) {
        println(s"$self, I'm trying: $testScore")
        testScore = testChild
      }
      println(s"$self final score: $testScore")
      sender ! Done

    case Failed => sender ! Failed
    case _      => sender ! Failed
  }
}

