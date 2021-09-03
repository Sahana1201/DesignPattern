package com.xworkz.groups_DTO;

import java.io.Serializable;

import com.xworks.groups_constants.MachineBrand;
import com.xworks.groups_constants.MachineTypes;

public class MachineDTO implements Serializable {

	private MachineTypes machineTypes;
	private float price;
	private MachineBrand brand;
	private boolean isworking;

	public MachineDTO() {
		System.out.println("Default constructor");
	}

	public MachineDTO(MachineTypes machineTypes, float price, MachineBrand brand, boolean isworking) {
		super();
		this.machineTypes = machineTypes;
		this.price = price;
		this.brand = brand;
		this.isworking = isworking;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof MachineDTO) {
			MachineDTO casted = (MachineDTO) obj;
			if (this.brand.equals(casted.getBrand()) && this.machineTypes.equals(casted.getMachineTypes())) {
				System.out.println("Machine is equal ");
				return true;
			} else {
				System.out.println("Machine's are not equal  ");
				return false;
			}
		}
		return false;
	}

	public MachineTypes getMachineTypes() {
		return machineTypes;
	}

	public void setMachineTypes(MachineTypes machineTypes) {
		this.machineTypes = machineTypes;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public MachineBrand getBrand() {
		return brand;
	}

	public void setBrand(MachineBrand brand) {
		this.brand = brand;
	}

	public boolean isIsworking() {
		return isworking;
	}

	public void setIsworking(boolean isworking) {
		this.isworking = isworking;
	}

	@Override
	public String toString() {
		return "MachineDTO [machineTypes=" + machineTypes + ", price=" + price + ", brand=" + brand + ", isworking="
				+ isworking + "]";
	}

}
