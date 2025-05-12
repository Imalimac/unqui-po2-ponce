package ar.edu.unq.po2.tp5INTERFACES;

abstract class Producto {
	public double precio;

	public Producto(double precio) {
		super();
		this.precio = precio;
	} 
	
	public double precio() {
		return this.precio*this.descuento();
	}
	
	abstract double descuento();

}
