package com.xworkz.designpattern.dp.dto;

public class CountryTester {

	public static void main(String[] args) {

		CountryDTO country1 = new CountryDTO("INDIA", "121cr", "Historical Placecs", 30, 4000);
		System.out.println(country1);
		
		CountryDTO country = new CountryDTO();
		country.setCountryName("Canada");
		country.setCountryPopulation("3.76cr");
		country.setFamousInCountry("Maple syrup is famous");
		country.setNumberOfCitiesInCountry(289);
		country.setNumberOfStatesInCountry(10);
		System.out.println(country);

	}

}
