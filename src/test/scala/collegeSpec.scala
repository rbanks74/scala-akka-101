
import college.College
import org.scalatest.FlatSpec

class collegeSpec extends FlatSpec{
  "A College" should "have a name" in {
    val c = new College("Rutgers University", "New Jersey", 10, 2.5)
    assert(c.name == "Rutgers University")
  }

  it should "have a location" in {
    val c = new College("Rutgers University", "New Jersey", 10, 2.5)
    assert(c.location == "New Jersey")
  }

  it should "have an enrollment size of 10" in {
    val c = new College("Rutgers University", "New Jersey", 10, 2.5)
    assert(c.enrollmentSize == 10)
  }

  it should "have a acceptance criteria of 2.5" in {
    val c = new College("Rutgers University", "New Jersey", 10, 2.5)
    assert(c.acceptanceCriteria == 2.5)
  }
}
