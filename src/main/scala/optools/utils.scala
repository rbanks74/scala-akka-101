package optools

import person.Student

import scala.io.BufferedSource
import scala.util.Try

object utils {

  //val file = io.Source.fromFile("students.csv")
  //  for (line <- file.getLines()) {
  //    val rows = line.split(",").map(_.trim)
  //    val names = rows(0).split(" ")

  def tryFile(filename: String): Try[BufferedSource] = {
    Try(io.Source.fromFile(filename))
  }

  def enrollStudentsFromCsv(studentFile: BufferedSource): Try[List[Student]] = {
    var studentList: List[Student] = List()
    for (line <- studentFile.getLines()) {
      val rows = line.split(",").map(_.trim)
      val names = rows(0).split(" ")
      //println(s"${names(0)} ${names(1)} ||| ${rows(1)}")
      studentList ::= new Student(names(0), names(1), rows(1).toInt)
    }
    Try(studentList)
  }


}
