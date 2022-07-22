package com.aurionpro.test1;

import java.util.ArrayList;

public class Invoice {
	ArrayList<Product> products;
	ArrayList<Double> alltaxes = new ArrayList<Double>();
	ArrayList<Double> alldiscount = new ArrayList<Double>();
	ArrayList<Double> alltotalPrice = new ArrayList<Double>();
	double totalcost;

	public Invoice(ArrayList<Product> items) {

		this.products = items;

		this.alltaxes = calculateTax();
		this.alldiscount = calculateDiscount();
		this.alltotalPrice = invoiceTotalPrice();
		this.totalcost = totalprices();

	}

	public double getTotalcost() {
		return totalcost;
	}

	public void display() {

		InvPrint print = new InvPrint();
		print.printDetails(this);

	}

	public ArrayList<Double> calculateTax() {

		ArrayList<Double> taxes = new ArrayList<Double>();

		for (int j = 0; j < products.size(); j++) {

			taxes.add(products.get(j).getAmount() * products.get(j).getTax() / 100);
		}

		return taxes;

	}

	public ArrayList<Double> calculateDiscount() {

		ArrayList<Double> discounts = new ArrayList<Double>();

		for (int j = 0; j < products.size(); j++) {

			discounts.add((products.get(j).getAmount() * products.get(j).getDiscountPercent()) / 100);
		}

		return discounts;

	}

	public ArrayList<Double> invoiceTotalPrice() {

		ArrayList<Double> alltotalprices = new ArrayList<Double>();

		for (int j = 0; j < products.size(); j++) {

			alltotalprices
					.add(products.get(j).getAmount() + products.get(j).getTax() - products.get(j).getDiscountPercent());
		}

		return alltotalprices;

	}

	public double totalprices() {

		for (int i = 0; i < products.size(); i++) {

			totalcost = totalcost + products.get(i).getAmount() + products.get(i).getTax()
					- products.get(i).getDiscountPercent();

		}
		return totalcost;
	}

	public ArrayList<Double> getAlltaxes() {
		return alltaxes;
	}

	public ArrayList<Double> getAlldiscount() {
		return alldiscount;
	}

	public ArrayList<Double> getAlltotalPrice() {
		return alltotalPrice;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

}
