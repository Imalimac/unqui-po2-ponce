package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplesTestCase {

	private Multiples multiples;

	/**
	 * Creates a basic test scenario, consisting in a multiples.
	 *
	 * @throws Exception
	 */

	@BeforeEach
	public void setUp() throws Exception {
		
		// Create the Multiples and assign the values for x and y.

		multiples = new Multiples(3,9);

		// Numbers 3 and 9 added. Function should return 999.
	}


/** Function verification. */	

@Test 
	public void testHihestMultiple() {
		// Getting the highest multiple between 3 and 9.
		int highestMultiple = multiples.highestMultipleFor();

		// I check the amount is the expected one
		assertEquals(highestMultiple, 999);
	}



@Test 
	public void testFunction() {
		// Set new values for x and y.
		multiples.setX(7);
		multiples.setY(11000);
		
		// Getting the highest multiple between 3 and 9.
		int highestMultiple = multiples.highestMultipleFor();

		// I check the amount is the expected one
		assertEquals(highestMultiple, -1);
	}

}