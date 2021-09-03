package com.xworkz.designpattern.dp.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable {

	private String customer_name;
	private int numberOfTickets;
	private String filmName;
	private int cost;
	private String heroName;

	public MovieDTO() {
		System.out.println("This  is default constructor");
	}

	public MovieDTO(String customer_name, int numberOfTickets, String filmName, int cost, String heroName) {
		super();
		this.customer_name = customer_name;
		this.numberOfTickets = numberOfTickets;
		this.filmName = filmName;
		this.cost = cost;
		this.heroName = heroName;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public int getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	@Override
	public String toString() {
		return "MovieDTO [customer_name=" + customer_name + ", numberOfTickets=" + numberOfTickets + ", filmName="
				+ filmName + ", cost=" + cost + ", heroName=" + heroName + "]";
	}

}
