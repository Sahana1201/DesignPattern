package com.xworkz.designpattern.dp.dto;

public class TelivisionTester {

	public static void main(String[] args) {

		TelivisionDTO telivision = new TelivisionDTO("Sony", 45000, "720p", true, "42inches");

		System.out.println(telivision);
		TelivisionDTO telivision1 = new TelivisionDTO();
		telivision1.setBrand("MI");
		telivision1.setPrice(32000);
		telivision1.setResolution("800p");
		telivision1.setSize("32inches");
		telivision1.setSmartTv(false);
		System.out.println(telivision1);

	}

}
