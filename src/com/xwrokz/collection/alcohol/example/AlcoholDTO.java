package com.xwrokz.collection.alcohol.example;

import java.io.Serializable;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO> {
	private String brand;
	private float price;
	private boolean isScotch;
	private int quantity;
	private String type;

	public AlcoholDTO() {
		super();
	}

	public AlcoholDTO(String brand, float price, boolean isScotch, int quantity, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.isScotch = isScotch;
		this.quantity = quantity;
		this.type = type;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", isScotch=" + isScotch + ", quantity=" + quantity
				+ ", type=" + type + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isScotch() {
		return isScotch;
	}

	public void setScotch(boolean isScotch) {
		this.isScotch = isScotch;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int compareTo(AlcoholDTO o) {
		return (this.getBrand().compareTo(o.getBrand()));

	}

}
