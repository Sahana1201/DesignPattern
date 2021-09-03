package com.xworkz.collections.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmployeeId {

	public static void main(String[] args) {
		String empId1 = "sahana12";
		String empId2 = "teju124";
		String empId3 = "Prajju145";
		String empId4 = "Shanthanu248";
		String empId5 = "Anusha852";
		String empId6 = "Harsha876";
		String empId7 = "Dhanya753";
		String empId8 = "Bharath789";
		String empId9 = "Keerthi723";
		String empId10 = "Suma789";

		Collection<String> collection = new ArrayList<>();

		collection.add(empId10);
		collection.add(empId9);
		collection.add(empId1);
		collection.add(empId3);
		collection.add(empId7);
		collection.add(empId8);
		collection.add(empId6);
		collection.add(empId5);
		collection.add(empId4);
		collection.add(empId2);

		Iterator itr = collection.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();

			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.toUpperCase());
			}

		}

	}

}
