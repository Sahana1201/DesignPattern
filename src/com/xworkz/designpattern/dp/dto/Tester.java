package com.xworkz.designpattern.dp.dto;

public class Tester {

	public static void main(String[] args) {

		TelivisionDTO telivision = new TelivisionDTO("Sony", 45000, "720p", true, "42inches");
		System.out.println(telivision);

		MovieDTO movie = new MovieDTO("Sahana", 2, "Pogaru", 500, "Dhruva");
		System.out.println(movie);

		PlaceDTO place1 = new PlaceDTO("Tumkur", "Sidhagnage Mutt", 74, "Nijgal,Sidhrubetta");
		System.out.println(place1);

		CountryDTO country1 = new CountryDTO("INDIA", "121cr", "Historical Placecs", 30, 4000);
		System.out.println(country1);

		MessageDTO message1 = new MessageDTO(100, 1, "Teju", "Sahana", "0.5rs");
		System.out.println(message1);

	}

}
