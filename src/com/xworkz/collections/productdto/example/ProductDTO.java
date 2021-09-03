package com.xworkz.collections.productdto.example;

import java.io.Serializable;

public class ProductDTO implements Serializable, Comparable<ProductDTO> {

	private String name;
	private String brand;
	private float price;
	private int quatity;

	public ProductDTO() {
		super();
	}

	public ProductDTO(String name, String brand, float price, int quatity) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quatity = quatity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getQuatity() {
		return quatity;
	}

	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}

	@Override
	public String toString() {
		return "ProductDTO [name=" + name + ", brand=" + brand + ", price=" + price + ", quatity=" + quatity + "]";
	}

	@Override
	public int compareTo(ProductDTO ref) {
		float priceRef = ref.getPrice();
		if (this.price == priceRef)
			return 0;
		if (this.price < priceRef)
			return -1;
		if (this.price < priceRef)
			return +1;
		return 0;
	}

}
