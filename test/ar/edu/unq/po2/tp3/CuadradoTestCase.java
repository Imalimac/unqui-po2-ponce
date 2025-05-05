package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CuadradoTestCase {
	public Cuadrado cuadrado = new Cuadrado(4);
	
	
	@Test
	void vertices() {
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getX(), 4 );
		assertEquals(cuadrado.getEsquinaSuperiorDerecha().getY(), 4 );
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getX(), 0 );
		assertEquals(cuadrado.getEsquinaSuperiorIzquierda().getY(), 4 );
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getX(), 4 );
		assertEquals(cuadrado.getEsquinaInferiorDerecha().getY(), 0 );
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getX(), 0 );
		assertEquals(cuadrado.getEsquinaInferiorIzquierda().getY(), 0 );
	}
	
	@Test
	void ancho() {
		assertEquals(cuadrado.getAncho(), 4 );
	}
	
	@Test
	void alto() {
		assertEquals(cuadrado.getAlto(), 4 );
	}
	
	@Test
	void area() {
		assertEquals(cuadrado.area(), 16 );
	}
	
	@Test
	void perimetro() {
		assertEquals(cuadrado.perimetro(), 24 );
	}
	
	@Test
	void vertical() {
		assertEquals(cuadrado.esVertical(), false );
	}
	
	@Test
	void horizontal() {
		assertEquals(cuadrado.esHorizontal(), false );
	}

}
