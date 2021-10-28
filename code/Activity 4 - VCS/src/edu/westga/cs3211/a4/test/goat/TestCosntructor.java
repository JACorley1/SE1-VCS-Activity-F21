package edu.westga.cs3211.a4.test.goat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Goat;

class TestCosntructor {

	@Test
	void testValidConstruction() {
		Goat goat1 = new Goat(5, true);
		
		assertAll (
			() -> assertTrue(goat1.isAlive()),
			() -> assertEquals(5, goat1.getAge())
		);
		
	}
	
	@Test
	void testInvalidAge() {
		assertThrows(IllegalArgumentException.class, () -> new Goat(-5, true));
	}
}
