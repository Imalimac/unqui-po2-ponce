package ar.edu.unq.po2.tp6SOLID;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {

	private Cliente jose;
	private Cliente maria;
	private PropiedadInmobiliaria propiedadJose;
	private PropiedadInmobiliaria propiedadMaria;
	private CreditoHipotecario creditoHipotecarioJose;
	private CreditoHipotecario creditoHipotecarioMaria;
	private CreditoPersonal creditoPersonalJose;
	private CreditoPersonal creditoPersonalMaria;
	private Banco banco;

	
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
		banco = new Banco(600000);

	}
	
	@Test
	void otorgarCredito() {
	/*
	 	Jose: 
	 	* Monto credito: 6000
	 	* capital del banco: 600000

	 */
		jose.solicitarCredito(banco, creditoHipotecarioJose);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().size(), 1);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(0), creditoHipotecarioJose);
		assertEquals(banco.getListaDeClientes().size(), 0);
		assertEquals(banco.getListaDeCreditosOtorgados().size(), 0);
		assertEquals(banco.getCapitalDelBanco(), 600000);
		assertEquals(jose.getSaldoCuenta(), 1000);
		
		banco.otorgarCredito(creditoHipotecarioJose);
		
		assertEquals(banco.getListaDeSolicitudesDeCreditos().size(), 0);
		assertEquals(banco.getListaDeClientes().size(), 1);
		assertEquals(banco.getListaDeClientes().get(0), jose);
		assertEquals(banco.getListaDeCreditosOtorgados().size(), 1);
		assertEquals(banco.getListaDeCreditosOtorgados().get(0), creditoHipotecarioJose);
		assertEquals(jose.getSaldoCuenta(), 7000);
		assertEquals(banco.getCapitalDelBanco(), 594000);
				
	}
	
	
	@Test
	void denegarCredito() {
	/*
	 	Jose: 
	 	* Monto credito: 6000
	 	* capital del banco: 600000

	 */

		jose.solicitarCredito(banco, creditoHipotecarioJose);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().size(), 1);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(0), creditoHipotecarioJose);
		assertEquals(banco.getListaDeClientes().size(), 0);
		assertEquals(banco.getListaDeCreditosOtorgados().size(), 0);
		assertEquals(banco.getCapitalDelBanco(), 600000);
		assertEquals(jose.getSaldoCuenta(), 1000);
		
		banco.denegarCredito(creditoHipotecarioJose);
		
		assertEquals(banco.getListaDeSolicitudesDeCreditos().size(), 0);
		assertEquals(banco.getListaDeClientes().size(), 0);
		assertEquals(banco.getListaDeCreditosOtorgados().size(), 0);
		assertEquals(jose.getSaldoCuenta(), 1000);
		assertEquals(banco.getCapitalDelBanco(), 600000);
	}
	
	@Test
	void evaluarSolicitud() {
		/*
		 	Jose: Credito hipotecario no aceptable.
		 	Maria: Credito hipotecario aceptable.
		 	Jose: Credito personal no aceptable.
		 	Maria: Credito personal no aceptable.
		 */
		
		jose.solicitarCredito(banco, creditoHipotecarioJose);
		maria.solicitarCredito(banco, creditoHipotecarioMaria);
		jose.solicitarCredito(banco, creditoPersonalJose);
		maria.solicitarCredito(banco, creditoPersonalMaria);

		assertEquals(banco.getListaDeSolicitudesDeCreditos().size(), 4);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(0), creditoHipotecarioJose);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(1), creditoHipotecarioMaria);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(2), creditoPersonalJose);
		assertEquals(banco.getListaDeSolicitudesDeCreditos().get(3), creditoPersonalMaria);
		assertEquals(maria.getSaldoCuenta(), 3000);
		assertEquals(banco.getCapitalDelBanco(), 600000);
	
		banco.evaluarTodasLasSolicitudesPendientes(banco.getListaDeSolicitudesDeCreditos());
		
		assertEquals(banco.getListaDeCreditosOtorgados().size(), 1);
		assertEquals(banco.getListaDeCreditosOtorgados().get(0), creditoHipotecarioMaria);
		assertEquals(maria.getSaldoCuenta(), 27000);
		assertEquals(banco.getCapitalDelBanco(), 576000);
	}


}
