package edu.westga.cs3211.a4.test.rabbit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.westga.cs3211.a4.model.Rabbit;

public class TestConstructor {

	@Test
	public void testNullColor() {
		// ASSERT
		assertThrows(IllegalArgumentException.class,
			()->{
				//ACT
				new Rabbit(null, true);
			}
		);
	}
	
	@Test
	public void testEmptyColor() {
		// ASSERT
		assertThrows(IllegalArgumentException.class,
			()->{
				//ACT
				new Rabbit("", true);
			}
		);
	}
	
	@Test
	public void testValidConstruction() {
		// ARRANGE
		Rabbit testRabbit = new Rabbit("Brown", false);
		
		// ASSERT
		Assertions.assertAll(
            () -> assertEquals("Brown", testRabbit.getColor),
            () -> assertEquals(false, testRabbit.getIsSpotted)
    );
	}

}
