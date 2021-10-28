package edu.westga.cs3211.a4.test.pig;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Pig;

class TestConstructor {

	@Test
	void testInvalidName() {
		assertThrows(IllegalArgumentException.class,
					()->{
						new Pig(null, 0);
					});
		
	}
	
	@Test
	void testEmptyName() {
		assertThrows(IllegalArgumentException.class,
				()->{
					new Pig("", 0);
				});
	}
	
	@Test
	void testValidConstruction() {
		String name = "myPig";
		Pig myPig = new Pig(name, 100);
		assertEquals(100, myPig.getNumber());
		assertEquals("myPig", myPig.getName());
	}

}
