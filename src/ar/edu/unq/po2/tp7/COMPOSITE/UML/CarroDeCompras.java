package ar.edu.unq.po2.tp7.COMPOSITE.UML;

import java.util.ArrayList;

public class CarroDeCompras {
	private ArrayList<Product>elements;

	private void setElements(ArrayList<Product> elements) {
		this.elements = elements;
	}
	
	public ArrayList<Product> getElements() {
		return elements;
	}
	
	public Integer totalRounded(){
		return Math.round(this.total());
	}
	
	public float total() {
		float total = 0;
		
		for(Product product : elements) {
			total = total + product.getPrice();
		}
		
		return total;
	}
	
	
}
