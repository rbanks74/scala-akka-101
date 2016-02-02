package optools

/** To interact with the Student Class  */
import person.Student

/** To read contents from a file and makes Try class available  */
import scala.io.BufferedSource
import scala.util.Try

/** utils object to supply helper methods for the Student and College Classes */
object utils {

  /** Method to check if file can be read
   * @param filename name of the file to be read
   * @return returns the file object if successful
   */
  def tryFile(filename: String): Try[BufferedSource] = {
    Try(io.Source.fromFile(filename))
  }


  /** Method to enroll students from a file into the College Class's studentList (or studentMap) -TODO
   * @param studentFile csv file of students
   * @return returns a list of students if successful
   */
  def enrollStudentsFromCsv(studentFile: BufferedSource): Try[List[Student]] = {
    var studentList: List[Student] = List()
    for (line <- studentFile.getLines()) {
      val rows = line.split(",").map(_.trim)
      val names = rows(0).split(" ")
      studentList ::= new Student(names(0), names(1), rows(1).toInt)
    }
    Try(studentList)
  }


}
