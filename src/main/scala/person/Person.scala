package person


/** To create Random value generators  */
import java.util.Random

/** To handle usage of Futures and Try methods */
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Success, Failure}


/** Superclass Person to create generic Person Instances
 *  This abstract class also includes the building blocks for Random Generators
  *  name their name
  *  age their age
  *  TODO: Move random value generators to utils package
 */
abstract class Person {
  val name: String
  var age: Int
  val intGen = new Random().nextInt()
  val doubleGen = new Random().nextDouble()
}

/** To create random 10-digit string of integers for the student id  */
trait StudentId extends Person {
  lazy val studentId: String = (0 until 10).map(x => math.abs((x * intGen) % 10)).mkString
}

/** Subclass Student of Superclass Person with Trait StudentId mixed in
 * @param firstName their first name
 * @param lastName their last name
 * @param studentAge their age
 * */
class Student(firstName: String, lastName: String, studentAge: Int) extends Person with StudentId {
  override val name: String = firstName + " " + lastName
  override var age: Int = studentAge
  val id = studentId

  /** Initialize gpa with a value of 0.0  */
  private var gpa: Double = 0.0

  /** To demonstrate the use of Futures on a seemingly difficult computation, on success => sets the gpa value.  */
  private val genGpa: Future[Double] = Future(BigDecimal((0 until 10000).map(x => math.abs(x * doubleGen)).sum % 5).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble)

  private val testingGpa: Future[Double] = genGpa
  testingGpa.onComplete{
    case Success(gpaVal) => gpa = gpaVal
    case Failure(t) => println("An error has occured: " + t.getMessage)
  }

  /** To Illustrate alternative way of evaluating the same future  */
  private val testingGpa2: Future[Double] = genGpa
  private val gpaOther: Future[Double] = for {
    someVal <- testingGpa2
  } yield someVal
  gpaOther.onComplete {
    case Success(gpaVal) => gpa = gpaVal
  }

  /** Helper functions to access Class attributes  */
  def getName: String = name
  def getAge: Int = age
  def getId: String = id
  def getGpa: Double = gpa

  /** Function to print the Student Instance  */
  override def toString = name + ": " + id
}
