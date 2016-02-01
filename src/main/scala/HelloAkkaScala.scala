
import college.College
import optools.utils.{enrollStudentsFromCsv, tryFile}
import person.Student

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}


object HelloAkkaScala extends App {

  val a = new Student("Tim", "Jones", 19)
  println(a)

  val b = new Student("Terry", "Simmons", 20)
  println(b)

  val c = new College("Rutgers University", "New Jersey", 65000, 3.0)
  println(c)

  val testFile = tryFile("students.csv" ) match {
    case Success(tf) => enrollStudentsFromCsv(tf)
    case failure@Failure(e) => failure
  }

  val test1File = tryFile("students.csv").flatMap(tf => enrollStudentsFromCsv(tf))
  //println(test1File)

  val test2File = for {
    tf <- tryFile("students.csv")
    theList <- enrollStudentsFromCsv(tf)
  } yield theList
  //println(test2File)

  val testingGpa: Future[Double] = b.gpa
  def anotherFun(gpaVal: Double): Future[Double] = Future(gpaVal)
  val confirm: Future[Double] = testingGpa.flatMap(p => anotherFun(p))




  //c.addStudent(List(a,b))
  //println(c.getStudentList)
}
