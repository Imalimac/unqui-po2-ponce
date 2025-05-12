package ar.edu.unq.po2.tp5INTERFACES;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductosTestCase {
	private ProductoCooperativa arroz;
	private ProductoTradicional agua;
	
	@BeforeEach
	public void setUp() {
		
	arroz = new ProductoCooperativa(1000);
	agua= new ProductoTradicional(500);
	}
	
	@Test
	public void PreciosYDescuentos() {
		assertEquals(arroz.descuento(), 0.9);
		assertEquals(arroz.precio(), 900);
		assertEquals(agua.descuento(), 1);
		assertEquals(agua.precio(), 500);
	}

}
