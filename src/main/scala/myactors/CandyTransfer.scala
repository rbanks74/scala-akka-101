package myactors

import akka.actor.ActorRef

object CandyTransfer {
  case class Transfer(from: ActorRef, to: ActorRef, numOfCandies: Int)
  case object Done
  case object Failed
}
/**
class UniversityTransfer extends Actor {


  def receive = {
    //case s: Student =>  {
    //  println("inside of UnivTransActor")
    //  println(s)
    //}

    case Transfer(from, to, student) =>
      from ! Child.Remove(student)
      context.become(awaitWithdraw(to, student, sender()))

  }

  def awaitWithdraw(to: ActorRef, student: Student, client: ActorRef): Receive = {
    case Child.Done =>
      to ! Child.Add(student)
      context.become(awaitDeposit(client))

    case Child.Failed =>
      client ! Failed
      context.stop(self)
  }

  def awaitDeposit(client: ActorRef): Receive = {
    case Child.Done =>
      client ! Done
      context.stop(self)
  }

}
**/