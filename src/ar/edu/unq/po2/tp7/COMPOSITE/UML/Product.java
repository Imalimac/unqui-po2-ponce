package ar.edu.unq.po2.tp7.COMPOSITE.UML;

public class Product {
	private float price;
	private String name;
	
	public Product(float price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public float getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}
}
