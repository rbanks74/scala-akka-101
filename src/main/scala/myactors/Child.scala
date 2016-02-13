package myactors

import akka.actor.Actor
import akka.event.Logging
import myactors.Child._

import scala.util.Random

object Child {
  case class TestChild()
  case class Done()
  case class Failed()
}

class Child extends Actor {

  val log = Logging(context.system, this)
  var testScore = 0
  def childTestScore: Int = math.abs(Random.nextInt(101))

  def receive = {

    case TestChild    =>
      testScore = childTestScore
      while (testScore < 80) {
        //println(s"$self, I'm trying: $testScore")
        log.info(s"$self, I'm trying: $testScore")
        testScore = childTestScore
      }
      //println(s"$self final score: $testScore")
      log.info(s"$self, Final Score: $testScore")
      sender ! Done

    case Failed => sender ! Failed
    case _      => sender ! Failed
  }
}

