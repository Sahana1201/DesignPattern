package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PlaceTester {

	public static void main(String[] args) {

		String place1 = "The Taj Mahal";
		String place2 = "The Red Fort";
		String place3 = "Hampi";
		String place4 = "BackWater Kerala";
		String place5 = "Goa";
		String place6 = "Jama Masjid Delhi";
		String place7 = "Akshardham Delhi";
		String place8 = "Old Bombay";
		String place9 = "Ajantha Ellora";
		String place10 = "The Golden Temple";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(place4);
		added = collection.add(place10);
		added = collection.add(place9);
		added = collection.add(place7);
		added = collection.add(place8);
		added = collection.add(place6);
		added = collection.add(place5);
		added = collection.add(place4);
		added = collection.add(place3);
		added = collection.add(place2);
		System.out.println(added);

		int total = collection.size();
		System.out.println(total);

		// collection.clear();

		System.out.println(collection.size());

		String check = "Ajantha Ellora";
		boolean contains = collection.contains(check);
		System.out.println("Contains:-" + contains);

		boolean removed = collection.remove("The Golden Temple");
		System.out.println("removed:-" + removed);

		Iterator iterator = collection.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		Object obj1 = iterator.next();
		System.out.println(obj);
		System.out.println(obj1);
	}

}