package com.xworkz.collection.streetdto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StreetTester {

	public static void main(String[] args) {

		List<String> name = new ArrayList<String>();
		name.add("Jaynagar");
		name.add("VijayNagar");
		name.add("Shettihalli Gate");
		name.add("C V Raman Nagar");
		name.add("Rajaji Nagar");

		List<Integer> pincode = new ArrayList<Integer>();
		pincode.add(5600411);
		pincode.add(560040);
		pincode.add(572114);
		pincode.add(560093);
		pincode.add(560010);

		List<String> landMark = new ArrayList<String>();
		landMark.add("Jaynagar metro station");
		landMark.add("Vijaynagar metro station");
		landMark.add("Near shettihalli gate");
		landMark.add("CV raman Nagar bus stand");
		landMark.add("RajajiNagar metro station");

		List<String> city = new ArrayList<String>();
		city.add("Banglore");
		city.add("Banglore");
		city.add("Tumkur");
		city.add("Banglore");
		city.add("Banglore");

		System.out.println(name);
		System.out.println(name.size());
		System.out.println(pincode);
		System.out.println(pincode.size());
		System.out.println(landMark);
		System.out.println(landMark.size());
		System.out.println(city);
		System.out.println(city.size());

		System.out.println(landMark.get(2));

		int indexOfVijayNagar = landMark.indexOf("Jaynagar metro station");
		System.out.println("*********");
		System.out.println("Index value is " + indexOfVijayNagar);

		ListIterator<String> itr = name.listIterator(4);
		System.out.println("*********");
		System.out.println("Itr index " + itr.nextIndex());

		System.out.println("*********");
		System.out.println("In Previous Order");
		while (itr.hasPrevious()) {
			String e = itr.previous();
			System.out.println(e);
		}

		System.out.println("*********");
		System.out.println("In Proper Order");
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}

		System.out.println("Name Size " + name.size());

		System.out.println("ADD ALL");
		name.addAll(city);
		city.addAll(landMark);
		System.out.println(name);
		System.out.println(city);
		System.out.println(city.size());
		System.out.println(landMark.size());

		Collections.sort(city);
		System.out.println("Below Data is sorted");
		System.out.println(city);

		for (int i = 0; i < city.size(); i++) {
			if ("Tumkur".equals(city.get(i))) {
				System.out.println("Banglore is found in index " + i);
			}

		}

		System.out.println("Contains Method");
		name.containsAll(city);
		System.out.println(name);

		System.out.println("Retain Method");
		name.retainAll(city);
		System.out.println(name);

		System.out.println("Remove Method");
		name.removeAll(city);
		System.out.println(name);
		System.out.println(name.size());

	}

}
