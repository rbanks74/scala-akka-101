package optools


object studentAssets {

  val allMajorList: List[String] = {
    List(
      "Biology",
      "Physics",
      "Business Administration",
      "Computer Science",
      "Chemistry",
      "Pre-Engineering",
      "Marketing",
      "Accounting",
      "Finance",
      "Economics",
      "Mathematics",
      "Music",
      "Software Engineering",
      "Engineering",
      "Information Technology"
    )
  }

  val allSchoolLevels: Map[String, List[String]] = {
    Map(
      "gradeSchool" ->
        List(
          "Pre-Kindergarten",
          "Kindergarten",
          "1st Grade",
          "2nd Grade",
          "3rd Grade",
          "4th Grade",
          "5th Grade",
          "6th Grade",
          "7th Grade",
          "8th Grade"),
      "college" ->
        List(
          "Freshman",
          "Sophomore",
          "Junior",
          "Senior"
        )
    )
  }
}
