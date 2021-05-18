package entities;

import abstracts.Entity;

public class Game implements Entity {
	
	private int id;
	private String name;
	private String category;
	private double price;
	private double discountValue;
	//private double priceAfterDiscount;
	
	public Game() {}

	public Game(int id, String name, String category, double price,double discountValue) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.discountValue= discountValue;
		//this.priceAfterDiscount = priceAfterDiscount;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(double discountValue) {
		this.discountValue = discountValue;
	}

	public double getPriceAfterDiscount() {
		return price - discountValue;
	}
	
	
	
	

}
