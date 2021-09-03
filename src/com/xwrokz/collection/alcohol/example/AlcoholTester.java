package com.xwrokz.collection.alcohol.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.personDto.example.PersonDTO;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO alcohol1 = new AlcoholDTO("RoyalStag", 1500f, false, 1, "Whisky");
		AlcoholDTO alcohol2 = new AlcoholDTO("Bacardi", 2000f, false, 1, "Rum");
		AlcoholDTO alcohol3 = new AlcoholDTO("Smirnoff", 750f, false, 1, "Vodka");
		AlcoholDTO alcohol4 = new AlcoholDTO("Johnie Walker", 2500f, true, 1, "Scotch");
		AlcoholDTO alcohol5 = new AlcoholDTO("Jack DAniel's", 3500f, false, 1, "Whisky");

		List<AlcoholDTO> list = new ArrayList<AlcoholDTO>();
		list.add(alcohol3);
		list.add(alcohol4);
		list.add(alcohol1);
		list.add(alcohol5);
		list.add(alcohol2);

		System.out.println("Brfore Sorting");
		Collections.sort(list);

		System.out.println("After sorting");
		System.out.println(list);
	}

}
