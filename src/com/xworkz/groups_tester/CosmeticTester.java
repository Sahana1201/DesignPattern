package com.xworkz.groups_tester;

import com.xworks.groups_constants.Brand;
import com.xworks.groups_constants.LipStickColour;
import com.xworks.groups_constants.Types;
import com.xworkz.groups_DTO.CosmeticDTO;

public class CosmeticTester {

	public static void main(String[] args) {

		CosmeticDTO cosmetic = new CosmeticDTO();
		CosmeticDTO cosmetic1 = new CosmeticDTO(Brand.Lakme, 2, Types.FaceCare, 250f, LipStickColour.lightpink);
		System.out.println(cosmetic1);
		CosmeticDTO cosmetic2 = new CosmeticDTO(Brand.MAC, 4, Types.SkinCare, 1500f, LipStickColour.red);
		System.out.println(cosmetic2);
		System.out.println(cosmetic1.equals(cosmetic2));

	}

}
