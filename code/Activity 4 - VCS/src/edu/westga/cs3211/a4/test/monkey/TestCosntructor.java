package edu.westga.cs3211.a4.test.monkey;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCosntructor {

	@Test
	void testNullHasTail() {
		//ASSERT
		assertThrows(IllegalArgumentException.class,
				()->{
					Monkey monkey = new Monkey(null, "Curious George");
				}
				);
	}
	
	@Test
	void testNullName() {
		//ASSERT
		assertThrows(IllegalArgumentException.class,
				()->{
					Monkey monkey = new Monkey(true, null);
				}
				);
	}
	@Test
	void testEmptyName() {
		//ASSERT
		assertThrows(IllegalArgumentException.class,
				()->{
					Monkey monkey = new Monkey(true, "");
				}
				);
	}
	
	@Test
	void testValidMonkey() {
		Monkey monkey = new Monkey(true, "Curious George";
		assertEquals(monkey.hasTail, true, "Checks if monkey has tail is correct");
		assertEquals(monkey.getName, "Curious George", "Checks if species matches");
	}

}
