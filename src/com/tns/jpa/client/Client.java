package com.tns.jpa.client;

import com.tns.jpa.entities.Student;
import com.tns.jpa.service.StudentService;
import com.tns.jpa.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		

		
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();

		student.setStudentid(100);
		student.setName("Mayuri");
		service.addStudent(student);
		/*
		student = service.findStudentById(100);
		System.out.println("ID: "+student.getStudentId());
		System.out.println("Nane: "+student.getName());
		

		student = service.findStudentById(100);
		student.setName("Mayuri Khutekar");
		service.updateStudent(student);

		
		student = service.findStudentById(100);
		System.out.println("ID: "+student.getStudentId());
		System.out.println("Name: "+student.getName());
		
		student = service.findStudentById(100);
		service.removeStudent(student);
		*/
		System.out.println("End of program / Life cycle completed...");
	}

}

