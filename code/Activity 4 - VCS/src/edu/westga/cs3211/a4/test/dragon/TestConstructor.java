package edu.westga.cs3211.a4.test.dragon;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Dragon;

class TestConstructor {

	@Test
	void testValidConstructor() {
		Dragon toothLess = new Dragon("red", 5);
		
		assertAll(()-> assertEquals("red", toothLess.getColor()),
				  ()-> assertEquals(5, toothLess.getWingspan())
				);
	}
	
	@Test
	void testNullColor() {
		assertThrows(IllegalArgumentException.class, () -> {new Dragon(null, 5);});
	}
	
	@Test
	void testEmptyColor() {
		assertThrows(IllegalArgumentException.class, () -> {new Dragon("", 5);});
	}
	
	@Test
	void testNegativeWingspan() {
		assertThrows(IllegalArgumentException.class, () -> {new Dragon("red", -5);});
	}
	
	@Test
	void testZeroWingspan() {
		assertThrows(IllegalArgumentException.class, () -> {new Dragon("red", 0);});
	}
}
