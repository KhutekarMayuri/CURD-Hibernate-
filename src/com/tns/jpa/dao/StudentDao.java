package com.tns.jpa.dao;

import com.tns.jpa.entities.Student;

public interface StudentDao {
	
	public abstract void addStudent(Student student);
	public abstract Student getStudentById(int id);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
	
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	

}
