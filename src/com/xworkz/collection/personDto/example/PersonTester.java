package com.xworkz.collection.personDto.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonTester {

	public static void main(String[] args) {

		PersonDTO person1 = new PersonDTO(22, "sahana", "sahana@gmail.com");
		PersonDTO person2 = new PersonDTO(25, "Hema", "hema@gmail.com");
		PersonDTO person3 = new PersonDTO(26, "Hemanth", "hemanth@gmail.com");
		PersonDTO person4 = new PersonDTO(28, "Preethi", "preethi@gamil.com");
		PersonDTO person5 = new PersonDTO(18, "Madhu", "madhu@gmail.com");

		List<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(person1);
		list.add(person4);
		list.add(person3);

		List<PersonDTO> list1 = new ArrayList<PersonDTO>();
		list1.add(person1);
		list1.add(person2);

		list1.addAll(list);
		System.out.println(list1);
		System.out.println("List Size " + list1.size());

		boolean containsAll = list1.containsAll(list);
		System.out.println("Contains ALL " + containsAll);

		PersonDTO person6 = person5;
		person6 = person3;

		boolean contains = list1.contains(person6);
		System.out.println(contains);

		System.out.println("Before Sorting");
		for (PersonDTO person : list) {
			System.out.println(person);
		}

		Collections.sort(list);

		System.out.println("After sorting");
		for (PersonDTO person : list) {
        System.out.println(person);
		}

	}
}
