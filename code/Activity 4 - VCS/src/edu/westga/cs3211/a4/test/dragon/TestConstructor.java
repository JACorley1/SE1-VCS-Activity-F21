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

}
