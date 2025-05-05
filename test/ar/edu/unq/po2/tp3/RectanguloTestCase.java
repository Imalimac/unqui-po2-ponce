package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	
	private  Rectangulo rectangulo = new Rectangulo(5, 3);

	@Test
	void vertices() {
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getX(), 5 );
		assertEquals(rectangulo.getEsquinaSuperiorDerecha().getY(), 3 );
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getX(), 0 );
		assertEquals(rectangulo.getEsquinaSuperiorIzquierda().getY(), 3 );
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getX(), 5 );
		assertEquals(rectangulo.getEsquinaInferiorDerecha().getY(), 0 );
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getX(), 0 );
		assertEquals(rectangulo.getEsquinaInferiorIzquierda().getY(), 0 );
	}
	
	@Test
	void ancho() {
		assertEquals(rectangulo.getAncho(), 5 );
	}
	
	@Test
	void alto() {
		assertEquals(rectangulo.getAlto(), 3 );
	}
	
	@Test
	void area() {
		assertEquals(rectangulo.area(), 15 );
	}
	
	@Test
	void perimetro() {
		assertEquals(rectangulo.perimetro(), 16 );
	}
	
	@Test
	void vertical() {
		assertEquals(rectangulo.esVertical(), false );
	}
	
	@Test
	void horizontal() {
		assertTrue(rectangulo.esHorizontal());
	}

}
