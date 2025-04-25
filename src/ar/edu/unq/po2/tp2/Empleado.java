package ar.edu.unq.po2.tp2;

public abstract class Empleado extends Persona {
	private float sueldoBasico;	

	public Empleado(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento, float sueldoBasico) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento);
		this.sueldoBasico = sueldoBasico;
	}

	public String desgloceDeConceptos() {
		return ("Sueldo Bruto: " + this.sueldoBruto() + 
				"Sueldo Básico: " + " " + this.getSueldoBasico() + 
				"Sueldo Neto: " + " " + this.sueldoNeto() + 
				"Retenciones: " + this.retenciones() + 
				"Obra Social: " + this.obraSocial()+
				"Aportes Jubilatorios: " + this.aportesJubilatorios()).toString();
	}
		
	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public abstract float sueldoBruto();

	public abstract float obraSocial();

	public abstract float aportesJubilatorios();

	public float retenciones() {
		return (this.obraSocial() + this.aportesJubilatorios());
	}

	public float sueldoNeto() {
		return (this.sueldoBruto() - this.retenciones());
	}
}



