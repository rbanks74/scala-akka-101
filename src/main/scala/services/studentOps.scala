package services

import college.College
import student.Student

object studentOps {

  def setId(student: Student): Student = {
    val updatedStudent = student.copy(id = student.generateIdString)
    updatedStudent
  }

  def updateGpa(student: Student): Student = {
    val updatedStudent = student.copy(gpa = student.generateGpa)
    updatedStudent
  }

  def collegeBelongedTo(student: Student): String = {
    "placeholder"
  }

  def canBeAccepted(student: Student, college: College): Boolean = student.gpa >= college.acceptanceCriteria

}
