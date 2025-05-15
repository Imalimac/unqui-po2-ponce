package ar.edu.unq.po2.tp6SOLID;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTestCase {
	private Cliente jose;
	private Cliente maria;
	private PropiedadInmobiliaria propiedadJose;
	private CreditoHipotecario creditoHipotecarioJose;
	private CreditoPersonal creditoPersonalMaria;
	private Banco banco;

	
	@BeforeEach
	public void setUp() {
		propiedadJose = new PropiedadInmobiliaria("Solis 33", "PH 2 ambientes", 8000);
		jose = new Cliente("Jose Perez", 64, 1000, 500, 6000);
		maria = new Cliente("Maria Lopez", 40, 3000, 2500, 60000);
		creditoHipotecarioJose = new CreditoHipotecario(jose, 6000, 24, propiedadJose);
		creditoPersonalMaria = new CreditoPersonal(maria, 21210, 12);
		banco = new Banco(600000);
	}
	
	@Test
	void solicitarCredito() {
		
		jose.solicitarCredito(banco, creditoHipotecarioJose);
		maria.solicitarCredito(banco, creditoPersonalMaria);
		
		assertEquals(banco.getListaDeSolicitudesDeCreditos().size(), 2);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(0), creditoHipotecarioJose);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(1), creditoPersonalMaria);
	}

}
