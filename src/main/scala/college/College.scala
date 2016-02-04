package college

import student.Student

/** Class College
 * @param studentList the list of student objects in the class
 * @param name the college name
 * @param enrollmentSize the enrollment size
 * @param acceptanceCriteria the acceptance criteria
 */
case class College(name: String, enrollmentSize: Int, acceptanceCriteria: Double, studentList: List[Student])
