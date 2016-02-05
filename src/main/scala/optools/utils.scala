package optools

import java.util.Random
import student.Student

import scala.io.BufferedSource
import scala.util.Try

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


  /** To create random 10-digit string of integers for an id  */
  val intGen: Int = new Random().nextInt()
  def generateIdString: String = (0 until 10).map(x => math.abs((x * intGen) % 10)).mkString

  /** To create random double with rounding  */
  val doubleGen: Double = new Random().nextDouble()
  def generateDouble: Double = BigDecimal((0 until 10000).map(x => math.abs(x * doubleGen)).sum % 5).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble

}
