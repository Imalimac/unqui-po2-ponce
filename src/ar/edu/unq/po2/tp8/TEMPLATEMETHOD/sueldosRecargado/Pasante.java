package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.sueldosRecargado;

//Subclases Concretas (Concrete Subclasses) 
public class Pasante extends Empleado {
	private double cantidadDeHorasTrabajadas=0;
	
	public Pasante() {
		super();
	}

	public double getCantidadDeHorasTrabajadas() {
		return cantidadDeHorasTrabajadas;
	}

	public void setCantidadDeHorasTrabajadas(double cantidadDeHorasTrabajadas) {
		this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
	}

	@Override
	double adicionales() {
		return 40*this.getCantidadDeHorasTrabajadas();
	}

	@Override
	double sueldoBasico() {
		return 0;
	}
}
