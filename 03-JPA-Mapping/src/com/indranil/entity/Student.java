package com.indranil.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String first_name;
	private String last_name;
	private String email;

	@OneToOne
	private Library library;

	@OneToMany(targetEntity = Library.class)
	private List<?> books_issued;

	@ManyToOne
	private Cariculam cariculam;

	@ManyToMany(targetEntity = Teacher.class)
	private List<?> teacher;

	public Student() {
		super();
	}

	
	public Student(int id, String first_name, String last_name, String email, List<?> teacher) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.teacher = teacher;
	}


	public Student(int id, String first_name, String last_name, String email, Library library, List<?> books_issued,
			Cariculam cariculam, List<?> teacher) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.library = library;
		this.books_issued = books_issued;
		this.cariculam = cariculam;
		this.teacher = teacher;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public List<?> getBooks_issued() {
		return books_issued;
	}

	public void setBooks_issued(List<?> books_issued) {
		this.books_issued = books_issued;
	}

	public Cariculam getCariculam() {
		return cariculam;
	}

	public void setCariculam(Cariculam cariculam) {
		this.cariculam = cariculam;
	}

	public List<?> getTeacher() {
		return teacher;
	}

	public void setTeacher(List<?> teacher) {
		this.teacher = teacher;
	}

}
