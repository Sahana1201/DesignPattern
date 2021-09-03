package com.xworkz.collections.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EmployeeSalary {

	public static void main(String[] args) {

		int empSalary1 = 2500;
		int empSalary2 = 3500;
		int empSalary3 = 1500;
		int empSalary4 = 4500;
		int empSalary5 = 2000;
		int empSalary6 = 7000;
		int empSalary7 = 6000;
		int empSalary8 = 120;
		int empSalary9 = 8200;
		int empSalary10 = 5000;

		Collection<Integer> collection = new ArrayList<>();

		collection.add(empSalary10);
		collection.add(empSalary9);
		collection.add(empSalary1);
		collection.add(empSalary3);
		collection.add(empSalary7);
		collection.add(empSalary8);
		collection.add(empSalary6);
		collection.add(empSalary5);
		collection.add(empSalary4);
		collection.add(empSalary2);

		Iterator<Integer> itr = collection.iterator();

		while (itr.hasNext()) {
			Integer empSalary = itr.next();
			if (empSalary >= 5000) {
				System.out.println("Salary is great");
				System.out.println(empSalary);

			} else if (empSalary >= 1000) {
				System.out.println("Good salary");
				System.out.println(empSalary);

			} else {
				System.out.println("not good Salary");
				System.out.println(empSalary);
			}

		}

	}
}
