import akka.actor._
import college.College
import myactors.Counter
import services.collegeOps._
import services.studentOps._
import student.Student

import scala.language.postfixOps

object Main extends App {

  /** Demonstrating creation of Student Instances  */
  val student1 = setId(Student("Tim Jones", 19, "A", 3.45))
  println(student1)

  val student2 = setId(Student("Danny Green", 23, "B", 3.92))
  println(student2)

  val student3 = setId(Student("Amy Green", 20, "C", 3.12))
  println(student3)

  val college1 = addStudentToCollege(List(student1, student2), College("Rowan University", 12, 3.50, List()))
  println(college1)

  // Try here would be not needed, only need to check if student is in the College list
  val f = if (college1.studentList.contains(student3)) removeStudentFromCollege(student3, college1) else s"Remove Failed: Student ${student3.name} is not enrolled at ${college1.name}"
  println(f)

  /**  Start of Scala Akka  **/
  val system = ActorSystem("HelloAkka")
  val counterActor = system.actorOf(Props(new Counter), "counter")

  counterActor ! "incr"
  counterActor ! "incr"
  counterActor ! "get"

  /**  Add Shutdown hook to shutdown service  **/
  system.shutdown()
}
