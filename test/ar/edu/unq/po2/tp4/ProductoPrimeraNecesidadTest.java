package ar.edu.unq.po2.tp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {
	private ProductoPrimeraNecesidad leche;
	//Ejercicio 2.
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		//Ejercicio 2.
		arroz = new ProductoPrimeraNecesidad("Arroz", 10d, false, 0.89);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	
	//Ejercicio 2.
	@Test
	public void descuentoVariable() {
		assertEquals(this.leche.getDescuento(), 0.9);
		assertEquals(this.leche.getPrecio(), 7.2);
		this.leche.setDescuento(0.92);
		assertEquals(this.leche.getDescuento(), 0.92);
		assertEquals(this.leche.getPrecio(), 7.36);
		assertEquals(this.arroz.getDescuento(), 0.89);
		assertEquals(this.arroz.getPrecio(), 8.9);
		
	}
}
