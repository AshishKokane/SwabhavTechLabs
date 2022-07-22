package com.aurionpro.model;

import java.util.ArrayList;

import com.aurionpro.test1.Invoice;
import com.aurionpro.test1.Product;

public class ProductTest {

	public static void main(String[] args) {

		ArrayList<Product> items = new ArrayList<>();
		items.add(new Product("101", "Chocolate", 100, 10, 5));
		items.add(new Product("102", "Biscuits", 100, 5, 10));
		items.add(new Product("103", "stationery", 150, 10, 5));
		items.add(new Product("104", "books", 200, 0, 5));

		Invoice invoice = new Invoice(items);
		invoice.display();

	}

}
