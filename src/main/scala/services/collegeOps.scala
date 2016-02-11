package services

import college.College
import student.Student

object collegeOps {

  /**
   *
   * @param student takes a list of student.Student instances
   * Side Effect: adds the students in the list to the studentsList
   */

  def addStudentToCollege(student: Student, college: College): College = college.copy(studentList = college.studentList :+ student)

  def addStudentToCollege(students: List[Student], college: College) = college.copy(studentList = college.studentList ++ students)

  def removeStudentFromCollege(student: Student, college: College) = college.copy(studentList = college.studentList.filter(_ != student))




  //def enrollStudentsFromCsv(studentFile: BufferedSource): Try[List[Student]] = {
  //  val studentList: List[Student] = List()
  //  for (line <- studentFile.getLines()) {
  //    val rows = line.split(",").map(_.trim)
  //    val names = rows(0).split(" ")
  //studentList ::= new Student(names(0), names(1), rows(1).toInt)
  //  }
  //  Try(studentList)
  //}
}
