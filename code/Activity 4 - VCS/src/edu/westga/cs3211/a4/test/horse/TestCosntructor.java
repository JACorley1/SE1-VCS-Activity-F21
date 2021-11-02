package edu.westga.cs3211.a4.test.horse;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Horse;
/**
 * This class will test the horse class' constructor
 * 
 * @author Fernando Dominguez
 * @version Fall 2021
 */
class TestCosntructor {

	@Test
	void TestNullHorseName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Horse(null, true);
		});
	}
	
	@Test
	void TestEmptyHorseName() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Horse("", true);
		});
	}
	
	@Test
	void TestValidHorse() {
		Horse pony = new Horse("Sprinkles", true);
		assertAll(
				() -> assertEquals("Sprinkles", pony.getName()),
				() -> assertEquals(true, pony.isVicious())
		);
	}
}
