package ar.edu.unq.po2.tp5INTERFACES;

import java.util.ArrayList;

public interface RegistrarProducto {
	public double montoTotal= 0; 
	
	public void sumarMontoProducto(Producto productoASumar);
	public void decrementarStock(ArrayList<Producto> listaDeProductos, Producto productoARestar);
	public void registrarProducto(ArrayList<Producto> listaDeProductos, Producto productoARestar);
}
