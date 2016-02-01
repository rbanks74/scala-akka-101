package college

import person.Student

sealed abstract class School {
  val name: String
  val location: String
  val enrollmentSize: Int
  val acceptanceCriteria: Double
  val allSchoolLevels: Map[String, List[String]] = {
    Map(
      "gradeSchool" ->
      List(
        "Pre-Kindergarten",
        "Kindergarten",
        "1st Grade",
        "2nd Grade",
        "3rd Grade",
        "4th Grade",
        "5th Grade",
        "6th Grade",
        "7th Grade",
        "8th Grade"),
      "college" ->
        List(
          "Freshman",
          "Sophomore",
          "Junior",
          "Senior"
        )
    )
  }
}

class College(cName: String, cLocation: String, cEnrollmentSize: Int, cAcceptanceCriteria: Double) extends School{
  override val name = cName
  override val location = cLocation
  override val enrollmentSize = cEnrollmentSize
  override val acceptanceCriteria = cAcceptanceCriteria
  val collegeLevels = allSchoolLevels.get("college").toList
  val allMajorList: List[String] = {
    List(
      "Biology",
      "Physics",
      "Business Administration",
      "Computer Science",
      "Chemistry",
      "Pre-Engineering",
      "Marketing",
      "Accounting",
      "Finance",
      "Economics",
      "Mathematics",
      "Music",
      "Software Engineering",
      "Engineering",
      "Information Technology"
    )
  }
  var studentsList: List[person.Student] = List()
  var studentMap = scala.collection.mutable.Map[String, Student]()

  def addStudent(student: person.Student): Unit = {
    studentsList ::= student
    studentMap += (student.getId -> student)
  }
  def addStudent(students: List[person.Student]): Unit = {
    students.foreach(x => studentsList ::= x)
    students.foreach(x => studentMap += (x.getId -> x))
  }

  def getStudentList: List[String] = studentsList.map(x => x.getId)

  override def toString = name + " " + studentsList
}
