
import college.College
import person.Student

object HelloAkkaScala extends App {

  val a = new Student("Tim", "Jones", 19)
  println(a)

  val b = new Student("Terry", "Simmons", 20)
  println(b)

  val c = new College("Rutgers University", "New Jersey", 65000, 3.0)
  println(c)

  c.addStudent(List(a,b))
  println(c.getStudentList)
}
