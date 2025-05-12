package ar.edu.unq.po2.tp5INTERFACES;

public class FacturaImpuestos extends Factura {
	private double tasaDeServicio;

	public FacturaImpuestos(String periodo, double tasaDeServicio) {
		super(periodo);
		this.tasaDeServicio = tasaDeServicio;
	}
	
	public double montoAPagar() {
		return this.tasaDeServicio;
	}

}
