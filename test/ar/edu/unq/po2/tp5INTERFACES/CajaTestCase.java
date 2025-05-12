package ar.edu.unq.po2.tp5INTERFACES;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTestCase {
	private ProductoCooperativa arroz;
	private ProductoCooperativa fideos;
	private ProductoTradicional agua;
	private Caja caja;
	//Parte 2:
	private FacturaServicios facturaServicios;
	private FacturaImpuestos facturaImpuestos;
	
	@BeforeEach
	public void setUp() {
		
	arroz = new ProductoCooperativa(1000);
	fideos = new ProductoCooperativa(100);
	agua = new ProductoTradicional(500);
	caja = new Caja();
	this.caja.agregarProducto(arroz);
	this.caja.agregarProducto(fideos);
	this.caja.agregarProducto(agua);

	// Parte 2:
	facturaServicios = new FacturaServicios("enero",  100,3);
	facturaImpuestos = new FacturaImpuestos("marzo", 500);
	
	}
	
	@Test
	public void RegistrarProducto() {
		assertEquals(caja.getListaDeProductos().size(), 3);
		assertEquals(caja.getListaDeProductos().get(0), arroz);
		assertEquals(caja.getListaDeProductos().get(1), fideos);
		assertEquals(caja.getListaDeProductos().get(2), agua);
		
		caja.registrarProducto(caja.getListaDeProductos(), agua);
		assertEquals(caja.getListaDeProductos().size(), 2);
		assertFalse( caja.getListaDeProductos().contains(agua));
		assertTrue( caja.getListaDeProductos().contains(arroz));
		assertTrue( caja.getListaDeProductos().contains(fideos));
		
		assertEquals(caja.getMontoTotal(), 500);
		
		caja.registrarProducto(caja.getListaDeProductos(), arroz);
		caja.registrarProducto(caja.getListaDeProductos(), fideos);
		assertEquals(caja.getListaDeProductos().size(), 0);
		assertEquals(caja.getMontoTotal(), 1490.0);
		
		assertEquals(caja.informarMontoACliente(), "Total a pagar" + 1490.0);
				
	}
	
	// Parte 2:
	@Test
	public void RegistrarPagoFactura() {
		assertEquals(facturaServicios.montoAPagar(), 300.0);
		assertEquals(facturaImpuestos.montoAPagar(), 500.0);
		caja.registrarPago(facturaImpuestos);
		assertTrue (caja.getAgencia().getFacturasPagas().contains(facturaImpuestos));
		caja.registrarPago(facturaServicios);
		assertEquals (caja.getAgencia().getFacturasPagas().size(), 2);
	}

}
