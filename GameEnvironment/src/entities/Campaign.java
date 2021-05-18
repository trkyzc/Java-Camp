package entities;

import abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String name;
	private int discountValue;
	
	public Campaign() {}

	public Campaign(int id, String name, int discountValue) {
		super();
		this.id = id;
		this.name = name;
		this.discountValue = discountValue;
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

	public int getDiscountValue() {
		return discountValue;
	}

	public void setDiscountValue(int discountValue) {
		this.discountValue = discountValue;
	}
	
	
	

}
