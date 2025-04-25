package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;

	public Persona () {}	
		
	public Persona(String nombre, String direccion, String estadoCivil, String fechaDeNacimiento) {
		super();
		DateTimeFormatter formateadorDeFechaDeNacimiento = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = LocalDate.parse(fechaDeNacimiento, formateadorDeFechaDeNacimiento);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public int edad() {
		final LocalDate hoy = LocalDate.now();

		return (hoy.getYear() - this.fechaDeNacimiento.getYear());
	}

}
