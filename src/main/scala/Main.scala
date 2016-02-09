import college.College
import rx.lang.scala.Observable
import services.collegeOps._
import services.studentOps._
import student.Student

import scala.language.postfixOps

object Main extends App {

  /** Demonstrating creation of Student Instances  */
  val a = Student("Tim Jones", 19, "A", 3.45)
  println(a)

  val h = setId(a)
  println(h)

  val d = Student("Danny Green", 23, "B", 3.92)
  println(d)

  val i = setId(d)
  println(i)

  val b = College("Rowan University", 12, 3.50, List())
  println(b)

  val studentList = List(h, i)
  val c = addStudentToCollege(studentList, b)
  println(c)

  val e = removeStudentFromCollege(h, c)
  println(e)

  val g = updateGpa(h)
  println(g)

  def hello(names: String*) = {
    Observable.from(names) subscribe { n =>
      println(s"Hello $n!")
    }
  }
  hello("Bill", "Bob", "Joe")

}
