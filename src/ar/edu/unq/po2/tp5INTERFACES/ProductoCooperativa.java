package ar.edu.unq.po2.tp5INTERFACES;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(double precio) {
		super(precio);
	}
	
	public double descuento() {
		return 0.9;
	}
	

}
