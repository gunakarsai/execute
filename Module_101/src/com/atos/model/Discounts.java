package com.atos.model;

public class Discounts {
	private int product_id;
	private int product_price;
	private int product_discount;
	private String discount_valid;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public int getProduct_discount() {
		return product_discount;
	}
	public void setProduct_discount(int product_discount) {
		this.product_discount = product_discount;
	}
	public Discounts() {
		super();
	}
	public String getDiscount_valid() {
		return discount_valid;
	}
	public void setDiscount_valid(String discount_valid) {
		this.discount_valid = discount_valid;
	}
	public Discounts(int product_id, int product_price, int product_discount, String discount_valid) {
		super();
		this.product_id = product_id;
		this.product_price = product_price;
		this.product_discount = product_discount;
		this.discount_valid = discount_valid;
	}
	
}
