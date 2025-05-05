package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTestCase {
	private Punto unPunto = new Punto(1,1);
	private Punto otroPunto = new Punto(2,2);
	
	@Test
	void crearPuntoSinParámetros() {
		Punto nuevoPunto = new Punto();
		
		assertEquals(nuevoPunto.nombreDelPunto(), "punto00");
	}
	
	@Test
	void moverPunto() {
		assertEquals(unPunto.nombreDelPunto(), "punto11");
		unPunto.moverArriba();
		assertEquals(unPunto.nombreDelPunto(), "punto12");
		unPunto.setXY(33, 0);
		assertEquals(unPunto.nombreDelPunto(), "punto330");
	}
	
	@Test
	void sumarPuntos() {
		Punto nuevoPunto = unPunto.sumarPuntos(otroPunto);
		
		assertEquals(nuevoPunto.nombreDelPunto(), "punto33");
	}

}
