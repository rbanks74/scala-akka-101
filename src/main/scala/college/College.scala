package college

/** To interact with the person.Student Class */
import person.Student


/** SuperClass: School, to generate generic School instances
  * name their name
  * location their location
  * enrollmentSize their enrollment size
  * acceptanceCriteria their acceptance criteria
  * allSchoolLevels their available school levels for subclasses to filter on
 */
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


/** Subclass College of Superclass School
 *
 * @param cName the college name
 * @param cLocation the college location
 * @param cEnrollmentSize the enrollment size
 * @param cAcceptanceCriteria the acceptance criteria
 */
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
  /** studentsList is a list of all students enrolled in the College Instance */
  var studentsList: List[person.Student] = List()

  /** studentMap is/will be a map of all students enrolled the College  */
  var studentMap = scala.collection.mutable.Map[String, Student]()

  /**
   *
   * @param student takes an instance of person.Student
   * Side Effect: adds the student to the studentsList and studentMap
   * TODO: Choose list of map version, not both
   */
  def addStudent(student: person.Student): Unit = {
    studentsList ::= student
    studentMap += (student.getId -> student)
  }

  /**
   *
   * @param students takes a list of person.Student instances
   * Side Effect: adds the students in the list to the studentsList and studentMap
   * TODO: Choose list of map version, not both
   */
  def addStudent(students: List[person.Student]): Unit = {
    students.foreach(x => studentsList ::= x)
    students.foreach(x => studentMap += (x.getId -> x))
  }

  /**
   *
   * @return a list of student ids that are in the College Instance
   */
  def getStudentList: List[String] = studentsList.map(x => x.getId)

  /**
   *
   * @return a string of the College name and list of student Instances
   */
  override def toString = name + " " + studentsList
}
