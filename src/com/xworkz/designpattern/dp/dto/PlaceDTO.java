package com.xworkz.designpattern.dp.dto;

import java.io.Serializable;

public class PlaceDTO implements Serializable{

	private String placeName;
	private String importanceOfPlace;
	private int busCharge;
	private String placesToVisit;

	public PlaceDTO() {
		System.out.println("This is default constructor");
	}

	public PlaceDTO(String placeName, String importanceOfPlace, int busCharge, String placesToVisit) {
		super();
		this.placeName = placeName;
		this.importanceOfPlace = importanceOfPlace;
		this.busCharge = busCharge;
		this.placesToVisit = placesToVisit;
	}

	public String getPlaceName() {
		return placeName;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}

	public String getImportanceOfPlace() {
		return importanceOfPlace;
	}

	public void setImportanceOfPlace(String importanceOfPlace) {
		this.importanceOfPlace = importanceOfPlace;
	}

	public int getBusCharge() {
		return busCharge;
	}

	public void setBusCharge(int busCharge) {
		this.busCharge = busCharge;
	}

	public String getPlacesToVisit() {
		return placesToVisit;
	}

	public void setPlacesToVisit(String placesToVisit) {
		this.placesToVisit = placesToVisit;
	}

	@Override
	public String toString() {
		return "PlaceDTO [placeName=" + placeName + ", importanceOfPlace=" + importanceOfPlace + ", busCharge="
				+ busCharge + ", placesToVisit=" + placesToVisit + "]";
	}

}
