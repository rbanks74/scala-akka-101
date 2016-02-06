import college.College
import services.collegeOps._
import services.studentOps._
import student.Student

object Main extends App {

  /** Demonstrating creation of Student Instances  */
  val a = Student("Tim Jones", 19, "A", 3.45)
  println(a)

  val h = setId(a)
  println(h)

  val d = Student("Danny Green", 23, "B", 3.92)
  println(d)

  val b = College("Rowan University", 12, 3.50, List())
  println(b)

  val studentList = List(a, d)
  val c = addStudentToCollege(studentList, b)
  println(c)

  val e = removeStudentFromCollege(a, c)
  println(e)

  val f = updateGpa(a)
  println(f)

  val g = updateGpa(h)
  println(g)


  //val db = MongoDBObject("studentA" -> 1, "studentB" -> 2)
  //val mdb = MongoClient()("scala-mongo-test")("smt")
  //println(mdb)


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
