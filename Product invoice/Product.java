package com.aurionpro.test1;

public class Product {

	private String id;
	private String description;
	private double amount;
	private double discountPercent;
	private float tax;

	public Product(String id, String description, double amount, float tax, double discountPercent) {
		super();
		this.id = id;
		this.description = description;
		this.amount = amount;
		this.tax = tax;
		this.discountPercent = discountPercent;
	}

	public String getId() {
		return id;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getDescription() {
		return description;
	}

	public double getAmount() {
		return amount;
	}

	public float getTax() {
		return tax;
	}

	@Override
	public String toString() {
		return "Invoice [id=" + id + ", description=" + description + ", amount=" + amount + ", discountPercent="
				+ discountPercent + ", tax=" + tax + "]";
	}

}
