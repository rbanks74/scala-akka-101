package college

import student.Student

/** To interact with the person.Student Class */


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


/** Class College
 * @param studentList the list of student objects in the class
 * @param name the college name
 * @param enrollmentSize the enrollment size
 * @param acceptanceCriteria the acceptance criteria
 */
case class College(name: String, enrollmentSize: Int, acceptanceCriteria: Double, studentList: List[Student])
