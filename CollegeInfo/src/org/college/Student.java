package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("Ranjithkumar");
	}

	public void StudentDept() {
		System.out.println("Mechanical");
	}

	public void studentID() {
		System.out.println("820512114066");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.studentName();
		s.StudentDept();
		s.studentID();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.hostelName();
	}

}
