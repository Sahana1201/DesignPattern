package com.xworkz.designpattern.dp.dto;

public class PlaceTester {

	public static void main(String[] args) {

		PlaceDTO place1 = new PlaceDTO("Tumkur", "Sidhagnage Mutt", 74, "Nijgal,Sidhrubetta");
		System.out.println(place1);
		
		PlaceDTO place = new PlaceDTO();
		place.setPlaceName("Banglore");
		place.setBusCharge(69);
		place.setImportanceOfPlace("Banglore  is known as silicon City");
		place.setPlacesToVisit("CubbonPark,Vishvwshwaria Museum");
		System.out.println(place);

	}

}
