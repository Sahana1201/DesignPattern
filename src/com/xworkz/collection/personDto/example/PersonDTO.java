package com.xworkz.collection.personDto.example;

import java.io.Serializable;

public class PersonDTO implements Serializable, Comparable<PersonDTO> {

	private int age;
	private String name;
	private String gmail;

	public PersonDTO() {
		super();
	}

	public PersonDTO(int age, String name, String gmail) {
		super();
		this.age = age;
		this.name = name;
		this.gmail = gmail;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	@Override
	public String toString() {
		return "PersonDTO [age=" + age + ", name=" + name + ", gmail=" + gmail + "]";
	}

	@Override
	public int compareTo(PersonDTO o) {
		int ageRef = o.getAge();
		if (this.age == ageRef)
			return 0;
		if (this.age > ageRef)
			return +1;
		if (this.age < ageRef)
			return -1;
		return 0;

	}

}
