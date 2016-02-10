package services

import college.College
import optools.utils.{generateIdString, generateGpa}
import student.Student

object studentOps {

  def setId(student: Student): Student = {
    student.copy(id = generateIdString)
  }

  def updateGpa(student: Student): Student = {
    //val updatedStudent = student.copy(gpa = generateGpa)
    //updatedStudent
    student.copy(gpa = generateGpa)
  }

  def collegeBelongedTo(student: Student): String = {
    "placeholder"
  }

  def canBeAccepted(student: Student, college: College): Boolean = student.gpa >= college.acceptanceCriteria

}
