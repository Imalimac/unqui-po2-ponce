package ar.edu.unq.po2.tp5INTERFACES;

import java.util.ArrayList;

public class Caja implements RegistrarProducto, Agencia {
	public double montoTotal= 0; 
	public ArrayList<Producto> listaDeProductos = new ArrayList<Producto>();
	public AgenciaRecaudadora agencia = new AgenciaRecaudadora();
	
	public void sumarMontoProducto(Producto productoASumar) {
		this.montoTotal = this.montoTotal + productoASumar.precio();
	}
	
	public void decrementarStock(ArrayList<Producto> listaDeProductos, Producto productoARestar) {
		listaDeProductos.remove(productoARestar);
	}
	
	public void registrarProducto(ArrayList<Producto> listaDeProductos, Producto productoARestar) {
		this.sumarMontoProducto(productoARestar);
		this.decrementarStock(listaDeProductos, productoARestar);
	}
	
	public void agregarProducto(Producto producto) {
		this.listaDeProductos.add(producto);
	}
	
	
	public ArrayList<Producto> getListaDeProductos() {
		return listaDeProductos;
	}

	public double getMontoTotal() {
		return montoTotal;
	}
	
	public String informarMontoACliente() {
		return "Total a pagar" + montoTotal;
	}
	
	public void registrarPago (Factura factura) {
		agencia.notificarPagoDeFactura(factura);
	}

	public AgenciaRecaudadora getAgencia() {
		return agencia;
	}

	public void setAgencia(AgenciaRecaudadora agencia) {
		this.agencia = agencia;
	}
	
	

}
