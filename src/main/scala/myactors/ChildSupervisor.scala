package myactors

import akka.actor._

object ChildSupervisor {
  case class Done()
  case class Failure()
}

class ChildSupervisor extends Actor with ActorLogging {

  val bill = context.actorOf(Props(new Child),"bill")
  val bob = context.actorOf(Props(new Child()),"bob")

  bill ! Child.TestChild
  bob  ! Child.TestChild

  def receive = {
    case Child.Done => log.info("Test Completed: {}", sender())
  }

}
