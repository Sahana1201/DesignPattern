package com.xworkz.designpattern.dp.dto;

import java.io.Serializable;

public class TelivisionDTO implements Serializable {

	private String brand;
	private double price;
	private String resolution;
	private boolean isSmartTv;
	private String size;

	public TelivisionDTO() {
		System.out.println("this is default constructor");
	}

	public TelivisionDTO(String brand, double price, String resolution, boolean isSmartTv, String size) {
		super();
		this.brand = brand;
		this.price = price;
		this.resolution = resolution;
		this.isSmartTv = isSmartTv;
		this.size = size;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public boolean isSmartTv() {
		return isSmartTv;
	}

	public void setSmartTv(boolean isSmartTv) {
		this.isSmartTv = isSmartTv;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "TelivisionDTO [brand=" + brand + ", price=" + price + ", resolution=" + resolution + ", isSmartTv="
				+ isSmartTv + ", size=" + size + "]";
	}

}
