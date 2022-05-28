package org.student;

import org.department.Department;

//Week3 Day1 Assignment - 2
public class Student extends Department {

	public void studentName() {
		System.out.println("This method contain detail of Student Names");
	}

	public void studentDept() {
		System.out.println("This method contain detail of Student Departments");

	}

	public void studentId() {
		System.out.println("This method contain detail of Student ID");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student detailOfStudent = new Student();
		
		detailOfStudent.collegeName();
		detailOfStudent.collegeCode();
		detailOfStudent.collegeRank();
		detailOfStudent.deptName();
		detailOfStudent.studentName();
		detailOfStudent.studentDept();
		detailOfStudent.studentId();
		

	}

}
