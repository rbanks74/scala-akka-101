package myactors

import akka.actor._

object ChildSupervisor {
  case class Done()
  case class Failure()
}

class ChildSupervisor extends Actor {

  val bill = context.actorOf(Props(new Child),"bill")
  val bob = context.actorOf(Props(new Child()),"bob")

  bill ! Child.TestStudent
  bob  ! Child.TestStudent

  def receive = {
    case Child.Done => println(s"Test Completed!")
  }

  /**
  def transfer(student: Student) = {
    val univTransferActor: ActorRef = context.actorOf(Props(new UniversityTransfer), "UnivTransferActor")
    univTransferActor ! UniversityTransfer.Transfer(university1, university2, student)
    context.become({
      case UniversityTransfer.Done =>
        println("success")
        context.stop(self)
    })
  }
  **/

}
