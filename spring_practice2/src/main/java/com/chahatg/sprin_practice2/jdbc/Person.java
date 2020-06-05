package com.chahatg.sprin_practice2.jdbc;

import java.util.Optional;

public class Person {
	Optional<Integer> id;
	String fname;
	String lname;
	String address;
	
	public Person() {
		super();
	}
	public Person(String fname, String lname, String addr) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = addr;
	}

	public Optional<Integer> getId() {
		return id;
	}
	
	public void setId(Optional<Integer> id) {
		this.id = id;
	}
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
