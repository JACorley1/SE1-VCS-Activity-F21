package edu.westga.cs3211.a4.test.ox;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Ox;

class TestConstructor {

	@Test
	void testDefaultConstructor() {
		Ox ox = new Ox();
		
		assertEquals(ox.getOxYear(), 1997);
		assertEquals(ox.getOxString(), "Fire");
	}
	
	@Test
	void testConstructor() {
		Ox ox = new Ox(2008, "Earth");
		
		assertEquals(ox.getOxYear(), 2008);
		assertEquals(ox.getOxString(), "Earth");
	}

}
