package com.xworkz.collections.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CountryCollection {

	public static void main(String[] args) {
		String country = "Australia";
		String country1 = "Canada";
		String country2 = "China";
		String country3 = "Brazil";
		String country4 = "India";
		String country5 = "Germany";
		String country6 = "Algeria";
		String country7 = "Finland";
		String country8 = "Mexio";
		String country9 = "Italy";
		String country10 = "Belgium";

		Collection<String> collection = new ArrayList<>();
		collection.add(country10);
		collection.add(country9);
		collection.add(country1);
		collection.add(country3);
		collection.add(country7);
		collection.add(country8);
		collection.add(country6);
		collection.add(country5);
		collection.add(country4);
		collection.add(country2);
		collection.add(country);

		Iterator<String> itr = collection.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();

			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.toUpperCase());
			}

		}
	}
}
