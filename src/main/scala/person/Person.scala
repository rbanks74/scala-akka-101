package person

import java.util.Random

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global


abstract class Person {
  val name: String
  var age: Int
  val intGen = new Random().nextInt()
  val doubleGen = new Random().nextDouble()
}

trait StudentId extends Person {
  lazy val studentId: String = (0 until 10).map(x => math.abs((x * intGen) % 10)).mkString
}

class Student(firstName: String, lastName: String, studentAge: Int) extends Person with StudentId {
  val id = studentId
  override val name: String = firstName + " " + lastName
  override var age: Int = studentAge

  val gpa: Future[Double] = Future(BigDecimal((0 until 10000).map(x => math.abs(x * doubleGen)).sum % 5).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble)

  
  //  gpa.onComplete{
  //    case Success(p) => gpa.value
  //    case Failure(t) => t
  //}

  def getName: String = name
  def getAge: Int = age
  def getId: String = id
  override def toString = name + ": " + id
}
