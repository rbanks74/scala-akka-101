package optools

import java.util.Random

import rx.lang.scala.Observable
import scala.concurrent.Future
import scala.io.BufferedSource
import scala.util.Try
import scala.concurrent.ExecutionContext.Implicits.global

/** utils object to supply helper/service methods */
object utils {

  /** To create random 10-digit string of integers for an id  */
  // make it a def and then put back into service
  def intGen: Int = new Random().nextInt()
  def generateIdString: String = (0 until 10).map(x => math.abs(x = (x * intGen) % 10)).mkString

  /** To create random double with rounding  */
  def doubleGen: Double = new Random().nextDouble()
  def generateGpa: Double = BigDecimal((0 until 10000).map(x => math.abs(x * doubleGen)).sum % 5).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble



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

  /** Testing out Observables and Subscriptions
   *   def hello(names: String*): Subscription = {
    Observable.from(names) subscribe { n =>
      println(s"Hello $n!")
    }
  }
  hello("Bill", "Bob", "Joe")
   */
}
