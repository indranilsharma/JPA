package com.indranil.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@ManyToMany(targetEntity = Student.class)
	private List<?> student;

	public Teacher(int id, String name, List<?> student) {
		super();
		this.id = id;
		this.name = name;
		this.student = student;
	}

	public Teacher() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<?> getStudent() {
		return student;
	}

	public void setStudent(List<?> student) {
		this.student = student;
	}

}
