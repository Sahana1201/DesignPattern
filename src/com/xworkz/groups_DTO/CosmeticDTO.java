package com.xworkz.groups_DTO;

import java.io.Serializable;

import com.xworks.groups_constants.Brand;
import com.xworks.groups_constants.LipStickColour;
import com.xworks.groups_constants.Types;

public class CosmeticDTO implements Serializable {

	private Brand brand;
	private int noOfpices;
	private Types types;
	private float price;
	private LipStickColour lipStickShape;

	public CosmeticDTO() {
		System.out.println("This is default constructor");
	}

	public CosmeticDTO(Brand brand, int noOfpices, Types types, float price, LipStickColour lipStickShape) {
		super();
		this.brand = brand;
		this.noOfpices = noOfpices;
		this.types = types;
		this.price = price;
		this.lipStickShape = lipStickShape;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Invoked Equals Method from CosmwticDTO");
		if (obj == null)
			return false;
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO casted = (CosmeticDTO) obj;
			if (this.brand.equals(casted.getBrand()) && this.types.equals(casted.getTypes())) {
				System.out.println("Same Product of the brand" + this.brand);
				return true;
			} else {
				System.out.println("Products are diffrent ");
				return false;
			}
		}
		return false;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getNoOfpices() {
		return noOfpices;
	}

	public void setNoOfpices(int noOfpices) {
		this.noOfpices = noOfpices;
	}

	public Types getTypes() {
		return types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public LipStickColour getLipStickShape() {
		return lipStickShape;
	}

	public void setLipStickShape(LipStickColour lipStickShape) {
		this.lipStickShape = lipStickShape;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", noOfpices=" + noOfpices + ", types=" + types + ", price=" + price
				+ ", lipStickShape=" + lipStickShape + "]";
	}

}
