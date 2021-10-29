package edu.westga.cs3211.a4.test.ox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Ox;

class TestConstructor {

	@Test
	void testDefaultConstructor() {
		Ox ox = new Ox();
		
		assertEquals(ox.getOxYear(), 1997);
		assertEquals(ox.getOxType(), "Fire");
	}
	
	@Test
	void testConstructor() {
		Ox ox = new Ox(1805, "Earth");
		
		assertEquals(ox.getOxYear(), 1805);
		assertEquals(ox.getOxType(), "Earth");
	}
	
	@Test
	void testNullType() {
		assertThrows(
				IllegalArgumentException.class, ()->{
					Ox ox = new Ox(2009, null);
				});
	}
	
	@Test
	void testEmptyType() {
		assertThrows(
				IllegalArgumentException.class, ()->{
					Ox ox = new Ox(2021, "");
				});
	}

	@Test
	void testInvalidYear() {
		assertThrows(
				IllegalArgumentException.class, ()->{
					Ox ox = new Ox(1806, "Fire");
				});
	}
	

	
}
