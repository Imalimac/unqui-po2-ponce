package ar.edu.unq.po2.tp7.COMPOSITE.UML;

public class SpecialProduct extends Product{
	private float price;
	
	public SpecialProduct(float price, String name) {
		super(price, name);
	}
	
	public float getPrice() {
		return this.price;
	}
}
