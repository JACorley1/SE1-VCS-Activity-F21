package edu.westga.cs3211.a4.test.snake;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Snake;

class TestConstructor {

	@Test
	void testConstructor() {
		Snake mySnake = new Snake(45.78, true);
		assertAll(()-> assertEquals(45.78, mySnake.getLength()),
				()-> assertEquals(true, mySnake.isVenomous()));
	}
	
	@Test
	void testConstructorLengthisZero() {
		assertThrows(IllegalArgumentException.class,  ()-> new Snake(0, true));
	}

}
