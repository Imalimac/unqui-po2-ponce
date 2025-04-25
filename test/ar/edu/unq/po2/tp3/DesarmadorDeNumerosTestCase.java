package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmadorDeNumerosTestCase {

		private DesarmadorDeNumeros desarmador;

		/**
		 * Creates a basic test scenario, consisting in a DesarmadorDeNumeros with ten integers.
		 *
		 * @throws Exception
		 */

		@BeforeEach
		public void setUp() throws Exception {
			
			// Creates the DesarmadorDeNumeros.

			desarmador = new DesarmadorDeNumeros();

			// Numbers added. Number with most even digits 12222.
			
			desarmador.addNumber(100);
			desarmador.addNumber(33);
			desarmador.addNumber(544);
			desarmador.addNumber(71);
			desarmador.addNumber(92);
			desarmador.addNumber(199);
			desarmador.addNumber(1756);
			desarmador.addNumber(12222);
			desarmador.addNumber(1);
			desarmador.addNumber(4);
		}
	

/**
 * Number with most even digits verification. */	
 
@Test 
		public void testNumberWithMostEvenDigits() {
			// Getting the even occurrences
			int number = desarmador.numberWithMostEvenDigits();
 
			// I check the amount is the expected one
			assertEquals(number, 12222);
		}


@Test 
public void testAmountofEvenDigitsFor() {
	// Getting the even occurrences for 1462.
	// I check if the amount is the expected one
	assertEquals(3, desarmador.amountOfEvenDigitsFor(1462));
}

}