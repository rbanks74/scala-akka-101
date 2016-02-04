package services

import college.College
import optools.utils.generateDouble
import student.Student

object studentOps {

  def updateGpa(student: Student): Student = {
    val updatedStudent = student.copy(gpa = generateDouble)
    updatedStudent
  }

  def collegeBelongedTo(student: Student): String = {
    "placeholder"
  }

  def canBeAccepted(student: Student, college: College): Boolean = student.gpa >= college.acceptanceCriteria

}
