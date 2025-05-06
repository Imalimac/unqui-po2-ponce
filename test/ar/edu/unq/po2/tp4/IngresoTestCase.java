package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTestCase {

	private Ingreso ingresoJulio;

	
	
	@BeforeEach
	public void setUp() {
		ingresoJulio = new Ingreso("Julio", "Honorarios", 700);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(ingresoJulio.getMesDePercepcion(), "Julio");
		assertEquals(ingresoJulio.getConcepto(), "Honorarios");
	}

	@Test
	public void Setters() {
		ingresoJulio.setConcepto("Bono por Permanencia");
		ingresoJulio.setMontoPercibido(350);
		assertEquals(ingresoJulio.getConcepto(), "Bono por Permanencia");
		assertEquals(ingresoJulio.getMontoPercibido(), 350);
	}
	
	@Test
	public void montoPercibido() {
		assertEquals(ingresoJulio.getMontoPercibido(), 700);	
	}
	
	@Test
	public void montoImponible() {
		assertEquals(ingresoJulio.getMontoImponible(), 700);	
	}

}
