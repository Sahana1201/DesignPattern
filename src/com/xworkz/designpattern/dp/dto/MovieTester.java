package com.xworkz.designpattern.dp.dto;

public class MovieTester {

	public static void main(String[] args) {

		MovieDTO movie = new MovieDTO("Sahana", 2, "Pogaru", 500, "Dhruva");
		System.out.println(movie);

		MovieDTO movie1 = new MovieDTO();
		movie1.setCustomer_name("Priya");
		movie1.setNumberOfTickets(1);
		movie1.setFilmName("2-States");
		movie1.setCost(255);
		movie1.setHeroName("Arjun Kapor");
		System.out.println(movie1);
	}

}
