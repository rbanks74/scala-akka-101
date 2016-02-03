
import college.College
import optools.utils.{enrollStudentsFromCsv, tryFile}
import person.Student

import scala.util.{Failure, Success}


object Main extends App {

  /** Demonstrating creation of Student Instances  */
  val a = new Student("Tim", "Jones", 19)
  println(a)

  val b = new Student("Terry", "Simmons", 20)
  println(b)

  /** Demonstrating creation of College Instances  */
  val c = new College("Rutgers University", "New Jersey", 65000, 3.0)
  println(c)

  /** Demonstrating the different ways of creating a list of Student Instances from a csv file (the Synchronous way!)  */
  val studentFile = tryFile("students.csv" ) match {
    case Success(tf) => enrollStudentsFromCsv(tf)
    case failure@Failure(e) => failure
  }

  val student1File = tryFile("students.csv").flatMap(tf => enrollStudentsFromCsv(tf))

  val student2File = for {
    tf <- tryFile("students.csv")
    theList <- enrollStudentsFromCsv(tf)
  } yield theList
}
