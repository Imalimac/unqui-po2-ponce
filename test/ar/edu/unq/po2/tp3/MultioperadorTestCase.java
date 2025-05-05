package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;


import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multioperador = new Multioperador();
	

	
	@Test
	void suma() {
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);
		
		// La Lista del multioperador debería ser [1,3,5]. 1+3+5 = 9.
		assertEquals(this.multioperador.add(), 9);
		
	}
	
	@Test
	void resta() {
		multioperador.addNumber(2);
		multioperador.addNumber(6);
		multioperador.addNumber(8);
		
		// La Lista del multioperador debería ser [2,6,8]. 2-6-8 = -16.
		assertEquals(this.multioperador.substract(), -16);
	}
	
	@Test
	void multiplicacion() {
		multioperador.addNumber(2);
		multioperador.addNumber(6);
		multioperador.addNumber(8);
		
		// La Lista del multioperador debería ser [2,6,8]. 2*6*8= 30.
		assertEquals(this.multioperador.multiply(), 96);

	}
	
	void constructorConParametros() {
		
		ArrayList<Integer> unaListaDeNumeros = new ArrayList<Integer>();
		unaListaDeNumeros.add(2);
		unaListaDeNumeros.add(5);
		unaListaDeNumeros.add(3);
		
		Multioperador  multioperadorConParametros = new Multioperador(unaListaDeNumeros);
		
		//Comprobar constructor con parámetros. La lista debería ser: [2,5,3].
		assertEquals(multioperadorConParametros.getListaDeEnteros(), unaListaDeNumeros);
		
		//La Lista debería ser: [2,5,3,9].
		multioperadorConParametros.addNumber(9);
		assertEquals(multioperadorConParametros.getListaDeEnteros(), (ArrayList<Integer>) Arrays.asList(2,5,3,9));
	}

}
