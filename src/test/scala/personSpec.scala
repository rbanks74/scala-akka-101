import person.Student
import org.scalatest.FlatSpec

class personSpec extends FlatSpec {
  "A Person" should "have a name" in {
    val p = new Student("Mary", "Wilcons", 23)
    assert(p.getName == "Mary Wilcons")
    }

  it should "get their age" in {
    val p = new Student("Mary", "Wilcons", 23)
    assert(p.getAge == 23)
  }

  it should "get their id" in {
    val p = new Student("Mary", "Wilcons", 23)
    assert(p.getId.isInstanceOf[String])
  }

  it should "get their gpa" in {
    val p = new Student("Mary", "Wilcons", 23)
    assert(p.getGpa.isInstanceOf[Double])
  }
}



