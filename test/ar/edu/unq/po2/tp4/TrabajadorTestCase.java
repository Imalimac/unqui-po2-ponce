package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTestCase {
	private Trabajador maria;
	private Ingreso ingresoJulio;
	private Ingreso ingresoAgosto;
	private IngresoPorHorasExtras ingresoHorasExtrasAgosto;

	
	@BeforeEach
	public void setUp() {
		maria = new Trabajador("Maria");
		ingresoJulio = new Ingreso("Julio", "Honorarios", 700);
		ingresoAgosto = new Ingreso("Agosto", "Honorarios", 1000);
		ingresoHorasExtrasAgosto = new IngresoPorHorasExtras("Agosto", "Honorarios por horas Extra", 500, 5);
		
		maria.agregarIngreso(ingresoJulio);
		maria.agregarIngreso(ingresoAgosto);
		maria.agregarIngreso(ingresoHorasExtrasAgosto);
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(maria.getTotalPercibido(), 2200);
	}

	@Test
	public void montoTotalImponible() {
		assertEquals(maria.getMontoImponible(), 1700);
	}
	
	@Test
	public void impuestoAPagar() {
		assertEquals(maria.getImpuestoAPagar(), 340);	
	}

}
