package com.subject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {
	@Id
	private int roll_no;
	private String name;
	private int marks;
	public Subject(int rollno, String name, int marks) {
		super();
		this.roll_no = rollno;
		this.name = name;
		this.marks = marks;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return roll_no;
	}
	public void setRollno(int rollno) {
		this.roll_no = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
