package optools

import college.College
import student.Student

object studentOps {

  /**
   *
   * @param student takes a list of student.Student instances
   * Side Effect: adds the students in the list to the studentsList and studentMap
   * TODO: Choose list or map version, not both
   */

  def addStudent(student: Student, college: College): College = {
    val currentList = college.studentList
    val newList: List[Student] = currentList :+ student
    val updatedCollege: College = college.copy(studentList = newList)
    updatedCollege
  }







  //def enrollStudentsFromCsv(studentFile: BufferedSource): Try[List[Student]] = {
  //  val studentList: List[Student] = List()
  //  for (line <- studentFile.getLines()) {
  //    val rows = line.split(",").map(_.trim)
  //    val names = rows(0).split(" ")
  //studentList ::= new Student(names(0), names(1), rows(1).toInt)
  //  }
  //  Try(studentList)
  //}


  /** Initialize gpa with a value of 0.0  */
  //private var gpa: Double = 0.0

  /** To demonstrate the use of Futures on a seemingly difficult computation, on success => sets the gpa value.  */
  //val doubleGen = new Random().nextDouble()
  //private val genGpa: Future[Double] = Future(BigDecimal((0 until 10000).map(x => math.abs(x * doubleGen)).sum % 5).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble)

  //private val testingGpa: Future[Double] = genGpa
  //testingGpa.onComplete{
  //  case Success(gpaVal) => gpa = gpaVal
  //  case Failure(t) => println("An error has occured: " + t.getMessage)
  //}
}
