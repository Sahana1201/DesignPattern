package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ActorTester {

	public static void main(String[] args) {

		String actor1 = "Sudeep";
		String actor2 = "Puneeth";
		String actor3 = "Ganesh";
		String actor4 = "Sonu Sood";
		String actor5 = "Darshan";
		String actor6 = "Shah Rukh khan";
		String actor7 = "Amitha Bachchan";
		String actor8 = "Surya";
		String actor9 = "Akshay Kumar";
		String actor10 = "Salman Khan";

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(actor10);
		added = collection.add(actor8);
		added = collection.add(actor7);
		added = collection.add(actor5);
		added = collection.add(actor4);
		added = collection.add(actor6);
		added = collection.add(actor4);
		added = collection.add(actor1);
		added = collection.add(actor2);
		added = collection.add(actor3);

		int total = collection.size();
		System.out.println("Total:-" + total);

		// collection.clear();

		String check = "Surya";
		boolean contains = collection.contains(check);
		System.out.println("Contains:-" + contains);

		boolean removed = collection.remove("Amitha Bachchan");
		System.out.println("Remove:-" + removed);

		Iterator iterator = collection.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println(obj);

	}

}
