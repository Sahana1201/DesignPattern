package com.xworkz.designpattern.dp.dto;

import java.io.Serializable;

public class CountryDTO implements Serializable {

	private String countryName;
	private String countryPopulation;
	private String famousInCountry;
	private int numberOfStatesInCountry;
	private int numberOfCitiesInCountry;

	public CountryDTO() {
		System.out.println("This is default constructor");
	}

	public CountryDTO(String countryName,String countryPopulation, String famousInCountry, int numberOfStatesInCountry,
			int numberOfCitiesInCountry) {
		super();
		this.countryName = countryName;
		this.countryPopulation = countryPopulation;
		this.famousInCountry = famousInCountry;
		this.numberOfStatesInCountry = numberOfStatesInCountry;
		this.numberOfCitiesInCountry = numberOfCitiesInCountry;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(String countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	public String getFamousInCountry() {
		return famousInCountry;
	}

	public void setFamousInCountry(String famousInCountry) {
		this.famousInCountry = famousInCountry;
	}

	public int getNumberOfStatesInCountry() {
		return numberOfStatesInCountry;
	}

	public void setNumberOfStatesInCountry(int numberOfStatesInCountry) {
		this.numberOfStatesInCountry = numberOfStatesInCountry;
	}

	public int getNumberOfCitiesInCountry() {
		return numberOfCitiesInCountry;
	}

	public void setNumberOfCitiesInCountry(int numberOfCitiesInCountry) {
		this.numberOfCitiesInCountry = numberOfCitiesInCountry;
	}

	@Override
	public String toString() {
		return "CountryDTO [countryName=" + countryName + ", countryPopulation=" + countryPopulation
				+ ", famousInCountry=" + famousInCountry + ", numberOfStatesInCountry=" + numberOfStatesInCountry
				+ ", numberOfCitiesInCountry=" + numberOfCitiesInCountry + "]";
	}

}
