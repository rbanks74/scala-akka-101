package person

import java.util.Random


abstract class Person {
  val name: String
  var age: Int
  val idGen = new Random().nextInt()
}

trait StudentId extends Person{
  lazy val studentId: String = (0 until 10).map(x => math.abs((x * idGen) % 10)).mkString
}

class Student(firstName: String, lastName: String, studentAge: Int) extends Person with StudentId {
  val id = studentId
  override val name: String = firstName + " " + lastName
  override var age: Int = studentAge
  def getName: String = name
  def getAge: Int = age
  def getId: String = id
  override def toString = name +": " + id
}