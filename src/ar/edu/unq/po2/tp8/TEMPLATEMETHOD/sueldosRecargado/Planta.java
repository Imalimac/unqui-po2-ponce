package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.sueldosRecargado;

//Subclases Concretas (Concrete Subclasses) 
public class Planta extends Empleado {
	private Integer cantidadDeHorasTrabajadas = 0;
	private String estadoCivil;
	private Integer cantidadDeHijos;

	public Planta (String estadoCivil, Integer cantidadDeHijos) {
		this.estadoCivil = estadoCivil;
		this.cantidadDeHijos = cantidadDeHijos;
	}


	public Integer getCantidadDeHorasTrabajadas() {
		return cantidadDeHorasTrabajadas;
	}

	public void setCantidadDeHorasTrabajadas(Integer cantidadDeHorasTrabajadas) {
		this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Integer getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(Integer cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	@Override
	double adicionales() {
		return 150*this.getCantidadDeHijos();
	}


	@Override
	double sueldoBasico() {
		return 3000;
	}
	

}
