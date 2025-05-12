package ar.edu.unq.po2.tp5INTERFACES;

abstract class Factura {
	private String periodo;
	
	
	public Factura(String periodo) {
		super();
		this.periodo = periodo;
	}

	
	public String periodoFacturado() {
		return periodo;
	}
	
	public String factura() {
		return this.periodoFacturado() + this.montoAPagar();
	}
	
	abstract double montoAPagar();
}
