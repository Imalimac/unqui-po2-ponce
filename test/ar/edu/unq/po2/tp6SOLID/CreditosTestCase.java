package ar.edu.unq.po2.tp6SOLID;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditosTestCase {
	private Cliente jose;
	private Cliente maria;
	private PropiedadInmobiliaria propiedadJose;
	private PropiedadInmobiliaria propiedadMaria;
	private CreditoHipotecario creditoHipotecarioJose;
	private CreditoHipotecario creditoHipotecarioMaria;
	private CreditoPersonal creditoPersonalJose;
	private CreditoPersonal creditoPersonalMaria;

	
	@BeforeEach
	public void setUp() {
		propiedadJose = new PropiedadInmobiliaria("Solis 33", "PH 2 ambientes", 8000);
		propiedadMaria = new PropiedadInmobiliaria("Moreno 33", "Departamento 3 ambientes", 28000);
		jose = new Cliente("Jose Perez", 64, 1000, 500, 6000);
		maria = new Cliente("Maria Lopez", 40, 3000, 2500, 60000);
		creditoHipotecarioJose = new CreditoHipotecario(jose, 6000, 24, propiedadJose);
		creditoHipotecarioMaria = new CreditoHipotecario(maria,24000, 24, propiedadMaria);
		creditoPersonalJose = new CreditoPersonal(jose, 480, 24);
		creditoPersonalMaria = new CreditoPersonal(maria, 21210, 12);

	}
	
	@Test
	void creditoHipotecario() {
		/*
		 	Jose: 
		 	* Neto mes:500
		 	* Neto anual: 6000
		 	* Monto credito: 24000
		 	* Monto cuota: 500
		 	* Monto tope: 1000
		 	* supera edad: No
		 	* propiedad valor fiscal: 8000
		 	* tope valor fiscal prop: 5600
		 */
		
		assertEquals(jose.getSueldoNetoMensual(), 500);
		assertEquals(jose.getSueldoNetoAnual(), 6000);
		assertEquals(creditoHipotecarioJose.getMontoSolicitado(), 6000);
		assertEquals(creditoHipotecarioJose.montoCuotaMensual(), 250);
		assertEquals(creditoHipotecarioJose.montoTopeDeCuota(), 250);
		assertTrue(creditoHipotecarioJose.noSuperaTopeDeValorFiscalDeGarantia());
		assertFalse(creditoHipotecarioJose.clienteNoSuperaEdadTope());
		assertFalse(creditoHipotecarioJose.esAceptable());

		/*
	 	Maria: 
	 	* Neto mes:2500
	 	* Neto anual: 60000
	 	* Monto credito: 24000
	 	* Monto cuota: 1000
	 	* Monto tope: 1250
	 	* supera edad: no
	 	* propiedad valor fiscal: 28000
	 	* tope valor fiscal prop: 19600
	 */
	
	assertEquals(maria.getSueldoNetoMensual(), 2500);
	assertEquals(maria.getSueldoNetoAnual(), 60000);
	assertEquals(creditoHipotecarioMaria.getMontoSolicitado(), 24000);
	assertEquals(creditoHipotecarioMaria.montoCuotaMensual(), 1000);
	assertEquals(creditoHipotecarioMaria.montoTopeDeCuota(), 1250);
	assertTrue(creditoHipotecarioMaria.noSuperaTopeDeValorFiscalDeGarantia());
	assertTrue(creditoHipotecarioMaria.clienteNoSuperaEdadTope());
	assertTrue(creditoHipotecarioMaria.esAceptable());
		
	}

	@Test
	void creditoPersonal() {
		/*
		 	Jose: 
		 	* Neto mes:500
		 	* Neto anual: 6000
		 	* Monto credito: 480
		 	* Monto cuota: 20
		 	* Monto tope: 350
		 	* NO es aceptable porque el neto anual es menor a 15000

		 */
		
		assertEquals(jose.getSueldoNetoMensual(), 500);
		assertEquals(jose.getSueldoNetoAnual(), 6000);
		assertEquals(creditoPersonalJose.getMontoSolicitado(), 480);
		assertEquals(creditoPersonalJose.montoCuotaMensual(), 20);
		assertEquals(creditoPersonalJose.montoTopeDeCuota(), 350);
		assertFalse(creditoHipotecarioJose.esAceptable());

		/*
	 	Maria: 
	 	* Neto mes:2500
	 	* Neto anual: 60000
	 	* Monto credito: 21210
	 	* Monto cuota: 1767.5
	 	* Monto tope: 1750
	 	* No es aceptable porque supera el tope de la cuota.

	 */
	
	assertEquals(maria.getSueldoNetoMensual(), 2500);
	assertEquals(maria.getSueldoNetoAnual(), 60000);
	assertEquals(creditoPersonalMaria.getMontoSolicitado(), 21210);
	assertEquals(creditoPersonalMaria.montoCuotaMensual(), 1767.5);
	assertEquals(creditoPersonalMaria.montoTopeDeCuota(), 1750);
	assertFalse(creditoPersonalMaria.esAceptable());
		
	}
	
}


