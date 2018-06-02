package com.Student;

public class StudentDetails {
	public void printStudent(Student student) {
		System.out.println(student);
		
	}
	
	public static void main(String []args) {
		Student student=new Student();
		student.setStudentId(5);
	 student.setFirstName("priya");
	 student.setLastName("sri");
	
	StudentDetails studentdetails=new StudentDetails();
	studentdetails.printStudent(student);
	}

}
