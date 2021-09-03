package com.xworkz.groups_tester;

import com.xworks.groups_constants.Colour;
import com.xworks.groups_constants.Flavour;
import com.xworkz.groups_DTO.ChocolateDTO;

public class ChocolateTester {

	public static void main(String[] args) {

		ChocolateDTO chocolatedto = new ChocolateDTO("Cadbury", 250, Flavour.Cofee, 250, Colour.brown);
		System.out.println(chocolatedto);
		ChocolateDTO chocolatedto1 = new ChocolateDTO("Cadbury", 500, Flavour.Cranberry, 500, Colour.litebrown);
		System.out.println(chocolatedto1);
		System.out.println(chocolatedto.equals(chocolatedto1));
	}

}
