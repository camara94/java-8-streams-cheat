package com.stardevcgroup.bibliotheque;

public class Author {
	
	private String firstname;
	private String lastname;
	private String usurname;
	private int age;
	private Gender gender;
	
	public Author() {}

	public Author(String firstname, String lastname, String usurname, Gender gender, int age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.usurname = usurname;
		this.age = age;
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsurname() {
		return usurname;
	}

	public void setUsurname(String usurname) {
		this.usurname = usurname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
}
