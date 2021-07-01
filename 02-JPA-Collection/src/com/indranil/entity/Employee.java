package com.indranil.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@ElementCollection
	private List<Address> address_list = new ArrayList<Address>();

	@ElementCollection
	private Set<Address> address_Set = new HashSet<Address>();

	@ElementCollection
	private Map<Integer, Address> map = new HashMap<Integer, Address>();

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

	public List<Address> getAddress_list() {
		return address_list;
	}

	public void setAddress_list(List<Address> address_list) {
		this.address_list = address_list;
	}

	public Set<Address> getAddress_Set() {
		return address_Set;
	}

	public void setAddress_Set(Set<Address> address_Set) {
		this.address_Set = address_Set;
	}

	public Map<Integer, Address> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Address> map) {
		this.map = map;
	}

}
