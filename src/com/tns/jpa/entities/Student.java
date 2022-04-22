package com.tns.jpa.entities;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	private int studentid;
	
	private String name;

	public int getStudentid() {
		return studentid;
	}

	public String getName() {
		return name;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
