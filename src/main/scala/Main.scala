import college.College
import com.mongodb.casbah.MongoClient
import com.mongodb.casbah.commons.MongoDBObject
import optools.utils._
import services.collegeOps._
import services.studentOps._
import student.Student

object Main extends App {

  /** Demonstrating creation of Student Instances  */
  val a = new Student("Tim Jones", 19, generateIdString, 3.45)
  println(a)

  val d = new Student("Danny Green", 23, generateIdString, 3.92)
  println(d)

  val b = new College("Rowan University", 12, 3.50, List())
  println(b)

  val studentList = List(a, d)
  val c = addStudentToCollege(studentList, b)
  println(c)

  val e = removeStudentFromCollege(a, c)
  println(e)

  val f = updateGpa(a)
  println(f)

  val db = MongoDBObject("studentA" -> 1, "studentB" -> 2)
  val mdb = MongoClient()("scala-mongo-test")("smt")
  println(mdb)

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
