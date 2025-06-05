package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.sueldosRecargado;

// Clase abstract o template class.
public abstract class Empleado {
		
	public Empleado() {
		super();
	}
	
	// Métodos concretos
	
	public double sueldo() {
		return this.sueldoBasico() + this.adicionales()- this.descuentos();
	}

	public double descuentos() {
		return this.sueldoBasico()*0.13;
	}
	
	// Método abstracto
	abstract double adicionales();
	abstract double sueldoBasico();

}
