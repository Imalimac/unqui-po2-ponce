package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	public String nombre;
	public String direccion;
	private ArrayList <Producto> listaDeProductos = new ArrayList<Producto>();
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

	public void setListaDeProductos(ArrayList<Producto> listaDeProductos) {
		this.listaDeProductos = listaDeProductos;
	}

	public void agregarProducto(Producto productoAAgregar) {
		this.listaDeProductos.add(productoAAgregar);
	}
	
	public Integer getCantidadDeProductos() {
		return this.listaDeProductos.size();
	}
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		
		for (Producto producto : this.listaDeProductos) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		
		return precioTotal;
	}
	
	
	
}
