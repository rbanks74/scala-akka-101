package student

import java.util.Random


trait StudentAttr {

  /** To create random 10-digit string of integers for an id  */
  val intGen: Int = new Random().nextInt()
  def generateIdString: String = (0 until 10).map(x => math.abs((x * intGen) % 10)).mkString

  /** To create random double with rounding  */
  val doubleGen: Double = new Random().nextDouble()
  def generateGpa: Double = BigDecimal((0 until 10000).map(x => math.abs(x * doubleGen)).sum % 5).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}


/**
 *
 * @param name student's name
 * @param age student's age
 * @param id student's id number (10-Digit string)
 * @param gpa student's gpa
 */
case class Student(name: String, age: Int, id: String, gpa: Double) extends StudentAttr {

}