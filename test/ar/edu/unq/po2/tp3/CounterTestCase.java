package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

		private Counter counter;

		/**
		 * Creates a basic test scenario, consisting in a counter with ten integers.
		 *
		 * @throws Exception
		 */

		@BeforeEach
		public void setUp() throws Exception {
			
			// Creates the counter.

			counter = new Counter();

			// Numbers added. Only 1 even and 9 uneven.
			counter.addNumber(1);
			counter.addNumber(3);
			counter.addNumber(5);
			counter.addNumber(7);
			counter.addNumber(9);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(1);
			counter.addNumber(4);
		}
	

/**
 * Even occurrences verification. */	
 
@Test 
		public void testEvenNumbers() {
			// Getting the even occurrences
			int amount = counter.getEvenOcurrences();
 
			// I check the amount is the expected one
			assertEquals(amount, 1);
		}

/**
 * Uneven occurrences verification. */	
 
@Test 
		public void testUnevenNumbers() {
			// Getting the even occurrences
			int amount = counter.getUnevenOcurrences();
 
			// I check the amount is the expected one
			assertEquals(amount, 9);
		}

/**
 * Multiple occurrences verification. */	
 
@Test 
		public void contadorDeMultiplosDe() {
			// Getting the even occurrences
			int amount = counter.contadorDeMultiplosDe(3);
 
			// I check the amount is the expected one
			assertEquals(amount, 2);
		}



}

