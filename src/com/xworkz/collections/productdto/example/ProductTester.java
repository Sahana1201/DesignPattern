package com.xworkz.collections.productdto.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.collection.personDto.example.PersonDTO;

public class ProductTester {

	public static void main(String[] args) {
		ProductDTO product1 = new ProductDTO("Compact", "Lakme", 450f, 1);
		ProductDTO product2 = new ProductDTO("EyeLiner", "Maybelline", 217f, 1);
		ProductDTO product3 = new ProductDTO("LipStick", "MAC", 3500f, 2);
		ProductDTO product4 = new ProductDTO("Concealer", "Maybelline", 500f, 2);
		ProductDTO product5 = new ProductDTO("Powder", "Ponds", 85f, 1);

		List<ProductDTO> list = new ArrayList<ProductDTO>();
		list.add(product3);
		list.add(product4);
		list.add(product2);
		list.add(product1);
		list.add(product5);

		System.out.println("List size " + list.size());

		System.out.println("Before Sorting");
		for (ProductDTO product : list) {
			System.out.println(product);
		}

		Collections.sort(list);

		System.out.println("After sorting");
		for (ProductDTO product : list) {
			System.out.println(product);
		}

	}

}
