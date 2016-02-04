
import college.College
import optools.studentOps._
import optools.utils._
import student.Student


object Main extends App {

  /** Demonstrating creation of Student Instances  */
  val a = new Student("Tim Jones", 19, generateIdString, 3.4)
  println(a)

  val d = new Student("Danny Green", 23, generateIdString, 3.9)
  println(d)

  val b = new College("Rowan University", 12, 3.5, List())
  println(b)

  val studentList = List(a, d)
  val c = addStudentToCollege(studentList, b)
  println(c)


  /**
  val student1File = tryFile("students.csv").flatMap(tf => enrollStudentsFromCsv(tf))
  println(student1File)

  val student2File = for {
    tf <- tryFile("students.csv")
    theList <- enrollStudentsFromCsv(tf)
  } yield theList
  println(student2File)
    */
}
