package com.xworkz.collection.bagdto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class BagTester {

	public static void main(String[] args) {

		List<String> brand = new ArrayList<String>();
		brand.add("Baggit");
		brand.add("Lavie");
		brand.add("Capresee");
		brand.add("Allen Solly");
		brand.add("Globad Desi");
		brand.add("Guess");

		List<Float> price = new ArrayList<Float>();
		price.add(2500f);
		price.add(3500f);
		price.add(1500f);
		price.add(4500f);
		price.add(5500f);
		price.add(6500f);

		List<String> type = new ArrayList<String>();
		type.add("HandBag");
		type.add("Clutch");
		type.add("Hobo Bag");
		type.add("BackPack");
		type.add("MessengerBag");
		type.add("Black");

		List<String> colour = new ArrayList<String>();
		colour.add("Black");
		colour.add("White");
		colour.add("Brown");
		colour.add("pink");
		colour.add("Orange");
		colour.add("Black");

		System.out.println(brand);
		System.out.println(brand.size());
		System.out.println(price);
		System.out.println(price.size());
		System.out.println(type);
		System.out.println(type.size());
		System.out.println(colour);
		System.out.println(colour.size());

		System.out.println(colour.get(2));

		int indexOfCapresee = brand.indexOf("Capresee");
		System.out.println("*********");
		System.out.println("Index value is " + indexOfCapresee);

		ListIterator<String> itr = brand.listIterator(3);
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

		System.out.println("Brand Size " + brand.size());

		System.out.println("ADD ALL");
		brand.addAll(type);
		type.addAll(brand);
		System.out.println(brand);
		System.out.println(type);
		System.out.println(brand.size());
		System.out.println(type.size());

		Collections.sort(brand);
		System.out.println("Below Data is sorted");
		System.out.println(brand);

		for (int i = 0; i < type.size(); i++) {
			if ("BackPack".equals(type.get(i))) {
				System.out.println("BackPack is found in index " + i);
			}

		}

		System.out.println("Contains Method");
		type.containsAll(brand);
		System.out.println(type);

		System.out.println("Retain Method");
		type.retainAll(brand);
		System.out.println(brand);

		System.out.println("Remove Method");
		type.removeAll(brand);
		System.out.println(type);
		System.out.println(type.size());

	}
}
