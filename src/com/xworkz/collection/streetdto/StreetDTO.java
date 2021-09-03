package com.xworkz.collection.streetdto;

import java.io.Serializable;

public class StreetDTO implements Serializable {

	private String name;
	private int pincode;
	private String landMark;
	private String City;

	public StreetDTO() {
		super();
	}

	public StreetDTO(String name, int pincode, String landMark, String city) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.landMark = landMark;
		City = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "StreetDTO [name=" + name + ", pincode=" + pincode + ", landMark=" + landMark + ", City=" + City + "]";
	}
	

}
