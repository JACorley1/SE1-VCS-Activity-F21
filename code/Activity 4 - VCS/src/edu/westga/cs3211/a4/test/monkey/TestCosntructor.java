package edu.westga.cs3211.a4.test.monkey;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Monkey;

class TestCosntructor {
	@Test
	void testWhenNameIsNull() {
		assertThrows(IllegalArgumentException.class,
				()->{
					new Monkey(true, null);
				}
				);
	}
	@Test
	void testWhenNameIsEmpty() {
		assertThrows(IllegalArgumentException.class,
				()->{
					new Monkey(true, "");
				}
				);
	}
	
	@Test
	void testValidMonkey() {
		Monkey monkey = new Monkey(true, "Curious George");
		assertEquals(monkey.isHasTail(), true, "Checks if monkey has tail is correct");
		assertEquals(monkey.getName(), "Curious George", "Checks if name matches");
	}

}