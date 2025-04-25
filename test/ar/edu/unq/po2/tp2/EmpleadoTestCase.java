package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Test;

class EmpleadoTestCase {
	public EmpleadoTemporal carlosTemporal = new EmpleadoTemporal("Carlos Temporal", "Solis 110", "soltero", "1988-12-02", 1000, "2026-12-25", 20);
	public EmpleadoPermanente juanPermanente  = new EmpleadoPermanente("Juan Permanente", "Libertad 225" , "casado", "1992-11-02",
			2000, 3, "2017-12-02");
	public EmpleadoContratado joseContratado = new EmpleadoContratado("Jose Contratado", "Alem 333", "soltero", "1984-11-02",
			1100, 22, "Transferencia");
	public Empresa laEmpresa = new Empresa();

	
	
	@Test
	void testEmpleadoTemporal() {
		assertEquals(this.carlosTemporal.getNombre(), "Carlos Temporal");
		assertEquals(this.carlosTemporal.getDireccion(), "Solis 110");
		assertEquals(this.carlosTemporal.getEstadoCivil(), "Soltero");
		assertEquals(this.carlosTemporal.getAñosDeAportes(), 20);
		assertEquals(this.carlosTemporal.getHorasExtra(), 0);
		assertEquals(this.carlosTemporal.sueldoBruto(), 1000);
		assertEquals(this.carlosTemporal.obraSocial(), 100);
		assertEquals(this.carlosTemporal.aportesJubilatorios(), 100);
		assertEquals(this.carlosTemporal.sueldoNeto(), 800);
		assertEquals(this.carlosTemporal.retenciones(), 200);
		
		//Horas extra y sueldo.
		this.carlosTemporal.setHorasExtra(10);
		assertEquals(this.carlosTemporal.getHorasExtra(), 10);
		assertEquals(this.carlosTemporal.sueldoBruto(), 1400);
		assertEquals(this.carlosTemporal.aportesJubilatorios(), 150);
		assertEquals(this.carlosTemporal.extraPorAñosDeAportes(), 0);
		
		//Horas extra y sueldo.
		this.carlosTemporal.setAñosDeAportes(51);
		assertEquals(this.carlosTemporal.getHorasExtra(), 10);
		assertEquals(this.carlosTemporal.extraPorAñosDeAportes(), 25);
		assertEquals(this.carlosTemporal.obraSocial(), 125);
		

	}
	
	@Test
	void testEmpleadoPermanente() {
		assertEquals(this.juanPermanente.getNombre(), "Juan Permanente");
		assertEquals(this.juanPermanente.getDireccion(), "Libertad 225");
		assertEquals(this.juanPermanente.getEstadoCivil(), "casado");
		
		assertEquals(this.juanPermanente.getCantidadDeHijos(), 3);
		assertEquals(this.juanPermanente.antiguedad(), 8);
		assertEquals(this.juanPermanente.asignacionPorAntiguedad(), 400);
		assertEquals(this.juanPermanente.asignacionPorConyuge(), 100);
		assertEquals(this.juanPermanente.asignacionPorHijo(), 450);
		
		//Sueldo.
		assertEquals(this.juanPermanente.getSueldoBasico(), 2000);
		assertEquals(this.juanPermanente.sueldoBruto(), 2950);
		assertEquals(this.juanPermanente.aportesJubilatorios(), 300);
		assertEquals(this.juanPermanente.obraSocial(), 355);
		assertEquals(this.juanPermanente.sueldoNeto(), 2295);
		assertEquals(this.juanPermanente.retenciones(), 655);
		
		//Cambio en asignaciones y sueldo.
		this.juanPermanente.setEstadoCivil("soltero");
		assertEquals(this.juanPermanente.asignacionPorConyuge(), 0);
		assertEquals(this.juanPermanente.sueldoBruto(), 2850);
	}
	
	@Test
	void testEmpleadoContratado() {
		assertEquals(this.joseContratado.getNombre(), "Jose Contratado");
		assertEquals(this.joseContratado.getDireccion(), "Alem 333");
		assertEquals(this.joseContratado.getEstadoCivil(), "soltero");
		
		//Sueldo.
		assertEquals(this.joseContratado.getSueldoBasico(), 1100);
		assertEquals(this.joseContratado.sueldoBruto(), 1100);
		assertEquals(this.joseContratado.aportesJubilatorios(), 300);
		assertEquals(this.joseContratado.obraSocial(), 0);
		assertEquals(this.joseContratado.sueldoNeto(), 800);
		assertEquals(this.joseContratado.retenciones(), 300);
		
		//Cambio en asignacion y sueldo.
		this.joseContratado.setEstadoCivil("soltero");
		assertEquals(this.joseContratado.getNumeroDeContrato(), 22);
		assertEquals(this.joseContratado.getMedioDePago(), "Transferencia");
		assertEquals(this.joseContratado.retenciones(), 50);
		
		
	}
	
}