package ar.edu.unq.po2.tp4;

public class Ingreso {
	public String mesDePercepcion;
	public String concepto;
	public double montoPercibido;
	
	public Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		super();
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
	
	public double getMontoImponible() {
		return this.montoPercibido;
	}
	
}
