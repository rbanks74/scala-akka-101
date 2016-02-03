import student.Student
import org.scalatest.FlatSpec

class personSpec extends FlatSpec {
  "A Person" should "have a name" in {
    val p = new Student("Mary Wilcons", 23, "123", 3.2)
    assert(p.name == "Mary Wilcons")
    }
}



