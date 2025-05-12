package ar.edu.unq.po2.tp5INTERFACES;

public class ProductoTradicional extends Producto{

	public ProductoTradicional(double precio) {
		super(precio);
	}

	public double descuento() {
		return 1;
	}

}
