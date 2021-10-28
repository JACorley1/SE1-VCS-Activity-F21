package edu.westga.cs3211.a4.model;

/**
 * Creates an object of Class Snake.
 */
public class Snake {
	private double length;
	private boolean venomous;
	
	
	/**
	 * Instantiates a new snake.
	 *
	 * @param length the length
	 * @param isVenomous the is venomous
	 */
	public Snake(double length, boolean isVenomous) {
		if (length <= 0) {
			throw new IllegalArgumentException("Snake length must be greater than zero");
		}
		this.length = length;
		this.venomous = isVenomous;
	}


	/**
	 * Gets the length.
	 *
	 * @return the length
	 */
	public double getLength() {
		return length;
	}



	/**
	 * Checks if is venomous.
	 *
	 * @return true, if is venomous
	 */
	public boolean isVenomous() {
		return venomous;
	}

	
}
