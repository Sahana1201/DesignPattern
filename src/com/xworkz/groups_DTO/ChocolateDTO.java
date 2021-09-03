package com.xworkz.groups_DTO;

import java.io.Serializable;

import com.xworks.groups_constants.Colour;
import com.xworks.groups_constants.Flavour;

public class ChocolateDTO implements Serializable {

	private String company;
	private int price;
	private Flavour flavour;
	private int quantityIngms;
	private Colour colour;

	public ChocolateDTO() {

		System.out.println("This is default constructor");
	}

	public ChocolateDTO(String company, int price, Flavour flavour, int quantityIngms, Colour colour) {
		super();
		this.company = company;
		this.price = price;
		this.flavour = flavour;
		this.quantityIngms = quantityIngms;
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [company=" + company + ", price=" + price + ", flavour=" + flavour + ", quantityIngms="
				+ quantityIngms + ", colour=" + colour + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method from ChocolateDTO");
		if (obj == null)
			return false;
		if (obj instanceof ChocolateDTO) {
			ChocolateDTO casted = (ChocolateDTO) obj;
			if (this.flavour.equals(casted.getFlavour()) && this.colour.equals(casted.getColour())) {
				System.out.println("Chocolate is equal " + this.company);
				return true;
			} else {
				System.out.println("Chocolate is not equal  ");
				return false;
			}
		}
		return false;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Flavour getFlavour() {
		return flavour;
	}

	public void setFlavour(Flavour flavour) {
		this.flavour = flavour;
	}

	public int getQuantityIngms() {
		return quantityIngms;
	}

	public void setQuantityIngms(int quantityIngms) {
		this.quantityIngms = quantityIngms;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

}
