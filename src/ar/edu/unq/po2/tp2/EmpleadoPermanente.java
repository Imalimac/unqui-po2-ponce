package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EmpleadoPermanente extends Empleado {
	private int cantidadDeHijos;
	private final LocalDate fechaDeIngreso;

	/*
	 * private float asignacionPorHijo = cantidadDeHijos * 150; private float
	 * asignacionPorConyuge; private float asignacionPorAntiguedad =
	 * this.antiguedad() * 50
	 */

	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento,
			float sueldoBasico, int cantidadDeHijos, String fechaDeIngreso) {
		super(nombre, direccion, estadoCivil, fechaDeNacimiento, sueldoBasico);
		DateTimeFormatter formateadorDeFechaDeNacimiento = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.cantidadDeHijos = cantidadDeHijos;
		this.fechaDeIngreso = LocalDate.parse(fechaDeIngreso, formateadorDeFechaDeNacimiento);
		
		
		
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public int antiguedad() {
		final LocalDate hoy = LocalDate.now();

		return (hoy.getYear() - this.fechaDeIngreso.getYear());
	}

	public int asignacionPorConyuge() {
		if (this.getEstadoCivil() == ("casado") | this.getEstadoCivil() == ("concubino")) {
			return 100;
		} else
			return 0;
	}

	public float asignacionPorHijo() {
		return cantidadDeHijos * 150;
	}

	public float asignacionPorAntiguedad() {
		return this.antiguedad() * 50;
	}

	@Override	
	public String desgloceDeConceptos() {
		return (
				"Sueldo Bruto: " + this.sueldoBruto()+
				"Sueldo Básico: " + this.getSueldoBasico()+
				"Asignacion Por Antiguedad: " + this.asignacionPorAntiguedad()+
				"Asignacion Por Cónyuge: " + this.asignacionPorConyuge()+ 
				"Asignacion Por Hijo: " + this.asignacionPorHijo()+
				"Retenciones: " + this.retenciones() + "Obra Social:" + " " + 				this.obraSocial()+
				"Aportes Jubilatorios: " + this.aportesJubilatorios()).toString();
	}


	@Override
	public float sueldoBruto() {
		return this.getSueldoBasico() + this.asignacionPorAntiguedad() + this.asignacionPorConyuge()
				+ this.asignacionPorHijo();
	}

	@Override
	public float obraSocial() {
		return (float) (0.10 * this.sueldoBruto() + this.getCantidadDeHijos() * 20);
	}

	@Override
	public float aportesJubilatorios() {
		return (float) (0.15 * this.sueldoBruto());
	}

}
