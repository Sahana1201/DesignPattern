package com.xworkz.collection.bagdto;

public class BagDTO {

	private String brand;
	private float price;
	private String type;
	private String colour;

	public BagDTO() {
		super();
	}

	public BagDTO(String brand, float price, String type, String colour) {
		super();
		this.brand = brand;
		this.price = price;
		this.type = type;
		this.colour = colour;

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "BagDTO [brand=" + brand + ", price=" + price + ", type=" + type + ", colour=" + colour + "]";
	}

}
