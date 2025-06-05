package ar.edu.unq.po2.tp8.TEMPLATEMETHOD.sueldosRecargado;

//Subclases Concretas (Concrete Subclasses) 
public class Temporario extends Empleado {
	private Integer cantidadDeHorasTrabajadas = 0;
	private String estadoCivil;
	private Integer cantidadDeHijos;

	public Temporario(String estadoCivil, Integer cantidadDeHijos) {
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

	private double adicionalGrupoFamiliar() {
		return 100;
	}
	
	private boolean tieneGrupoFamiliar() {
		return (this.getEstadoCivil()!= "soltero" || this.getCantidadDeHijos()>0);
	}
	
	private double extraPorHoraTrabajada() {
		return 5*this.getCantidadDeHorasTrabajadas();
	}

	@Override
	double adicionales() {
		if (this.tieneGrupoFamiliar()) {
			return this.extraPorHoraTrabajada()+this.adicionalGrupoFamiliar();
		} else {
			return this.extraPorHoraTrabajada();
		}
	}

	@Override
	double sueldoBasico() {
		return 1000;
	}
	
	
}
