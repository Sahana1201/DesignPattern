package com.xworkz.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MobileNumber {

	public static void main(String[] args) {
		long mobileNumber1 = 9845714854l;
		long mobileNumber2 = 8536475885l;
		long mobileNumber3 = 8754693214l;
		long mobileNumber4 = 9875631246l;
		long mobileNumber5 = 9632587412l;
		long mobileNumber6 = 8563214789l;
		long mobileNumber7 = 8536974125l;
		long mobileNumber8 = 7458962145l;
		long mobileNumber9 = 7863214589l;
		long mobileNumber10 = 7458963214l;

		Collection collection = new ArrayList();
		boolean added = false;
		added = collection.add(mobileNumber1);
		added = collection.add(mobileNumber4);
		added = collection.add(mobileNumber2);
		added = collection.add(mobileNumber3);
		added = collection.add(mobileNumber7);
		added = collection.add(mobileNumber6);
		added = collection.add(mobileNumber5);
		added = collection.add(mobileNumber10);
		added = collection.add(mobileNumber8);
		added = collection.add(mobileNumber9);

		int total = collection.size();
		System.out.println("Total:-" + total);
		
		//collection.clear();

		long check = 7458963214l;
		boolean contains = collection.contains(check);
		System.out.println("Contains:-" + contains);

		boolean removed = collection.remove(7458963214l);
		System.out.println("Remove:-" + removed);

		Iterator iterator = collection.iterator();
		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println(obj);

	}

}
