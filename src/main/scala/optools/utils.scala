package optools

import rx.lang.scala.Observable
import scala.concurrent.Future
import scala.io.BufferedSource
import scala.util.Try
import scala.concurrent.ExecutionContext.Implicits.global

/** utils object to supply helper/service methods */
object utils {

  /** Method to check if file can be read
 *
   * @param filename name of the file to be read
   * @return returns the file object if successful
   */
  def tryFile(filename: String): Try[BufferedSource] = {
    Try(io.Source.fromFile(filename))
  }

  /** Ways to get Student objects from a csv file with a Try
  val student1File = tryFile("students.csv").flatMap(tf => enrollStudentsFromCsv(tf))
  println(student1File)

  val student2File = for {
    tf <- tryFile("students.csv")
    theList <- enrollStudentsFromCsv(tf)
  } yield theList
  println(student2File)
    */


  def asyncFile(filename: String): Observable[Iterator[String]] = {
    Observable.from(Future(io.Source.fromFile(filename).getLines()))
  }

  /** Way to get each line of the file from the observable
  val readFile: Observable[Iterator[String]] = asyncFile("students.csv")
  readFile.subscribe(
    n => {
      if (n.hasNext) {      // if while is used, this will get every line of the file, but does blocking
        println(n.next())
      }
    }
  )
  */
}
