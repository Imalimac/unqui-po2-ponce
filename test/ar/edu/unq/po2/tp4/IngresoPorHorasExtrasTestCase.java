package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtrasTestCase {

	private IngresoPorHorasExtras ingresoHorasExtrasAgosto;

	
	@BeforeEach
	public void setUp() {
		
		ingresoHorasExtrasAgosto = new IngresoPorHorasExtras("Agosto", "Honorarios por horas extra", 500, 5);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(ingresoHorasExtrasAgosto.getMesDePercepcion(), "Agosto");
		assertEquals(ingresoHorasExtrasAgosto.getConcepto(), "Honorarios por horas extra");
		assertEquals(ingresoHorasExtrasAgosto.getCantidadDeHorasExtras(), 5); 
	}

	@Test
	public void Setters() {
		ingresoHorasExtrasAgosto.setCantidadDeHorasExtras(6);
		assertEquals(ingresoHorasExtrasAgosto.getCantidadDeHorasExtras(), 6);
	}
	
	@Test
	public void montoPercibido() {
		assertEquals(ingresoHorasExtrasAgosto.getMontoPercibido(), 500);	
	}
	
	@Test
	public void montoImponible() {
		assertEquals(ingresoHorasExtrasAgosto.getMontoImponible(), 0);	
	}

}
