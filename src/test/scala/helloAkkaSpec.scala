import person.Student
import org.scalatest.FlatSpec

class helloAkkaSpec extends FlatSpec {
  "A Person" should "have a name" in {
    val p = new Student("Mary", "Wilcons", 23)
    assert(p.getName == "Mary Wilcons")
    }

  it should "get their age" in {
    val p = new Student("Mary", "Wilcons", 23)
    assert(p.getAge == 23)
  }
}



