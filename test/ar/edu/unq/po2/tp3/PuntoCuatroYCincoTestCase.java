package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoCuatroYCincoTestCase {

	@Test
	void puntoCuatro() {
		 String a = "abc";
		 String s = a;
		 //String t;

		// Indique qué valores retornan y si dan error por qué:
		 assertEquals(s.length(), 3);
		 // assertEquals(t.length(), null); --> Retorna error porque no estáinicializada la variable.
		 assertEquals(1 + a, "1abc"); //--> Concatena en cadena. 
		 assertEquals(a.toUpperCase(), "ABC");
		 assertEquals("Libertad".indexOf("r"), 4);
		 assertEquals("Universidad".lastIndexOf('i'), 7);
		 assertEquals("Quilmes".substring(2,4), "il"); // --> No incluye el valor de la posición límite.
		 assertEquals((a.length() + a).startsWith("a"), false); // --> a.length() + a) = "3abc" y no empieza con "a", empieza con "3".
		 assertTrue(s == a);
		 assertTrue(a.substring(1,3).equals("bc")); 
	}
	
/* Punto 5. Tipos primitivos:
 * Teniendo en cuenta la documentación oficial de Java:
 
 * 1. ¿Qué son los tipos de datos primitivos?
 	* En Java, los tipos de datos primitivos son los tipos de datos más básicos y fundamentales que no son objetos y representan valores simples. Aquí tienes una breve descripción de cada uno:
		* byte: Útil para ahorrar memoria en grandes arreglos.
		* short: Similar a byte, pero con un rango más amplio.
		* int: El tipo de dato entero más comúnmente utilizado.
		* long: Cuando se necesita un rango de valores enteros más grande que int.
		* float: Para números en coma flotante de precisión simple.
		* double: Para números en coma flotante de precisión doble.
		* boolean: Para valores de verdad.
		* char: Para representar un solo carácter Unicode. 
		
 * 2. ¿Cuál es la diferencia entre un int y un Integer?
 	* En Java, la principal diferencia entre int e Integer es que int es un tipo primitivo, mientras que Integer es una clase. Un int es un número, mientras que un Integer es un puntero que hace referencia a una clase que contiene un entero. Se deben crear instancias de las variables enteras antes de poder usarlas, mientras que las variables int no son necesarias.  
 
 * 3. ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? ¿Y si se define una de tipo Integer? Haga la prueba en Eclipse.
 	* En Java, una variable de instancia de tipo int tiene un valor predeterminado de 0. Si no se inicializa explícitamente, el lenguaje asigna automáticamente este valor por defecto. Este comportamiento ocurre porque las variables de instancia pertenecen a los objetos y no a los métodos locales, lo que significa que siempre tienen un valor inicial establecido por el sistema. Sin embargo, si declaras una variable int dentro de un método sin inicializarla, obtendrás un error de compilación porque las variables locales no tienen valores predeterminados.
 	
 * 4. Responder la pregunta del punto anterior (3), pero ahora en lugar de definir una variable de instancia se define una variable de método.
 	* En Java, una variable de método (también conocida como variable local) de tipo int no tiene un valor predeterminado. A diferencia de las variables de instancia, las variables locales deben inicializarse explícitamente antes de ser utilizadas, o de lo contrario el programa no compilará y se generará un error. 
 */

}
