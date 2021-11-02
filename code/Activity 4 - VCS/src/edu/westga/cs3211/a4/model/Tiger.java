package edu.westga.cs3211.a4.model;

/**
 * The Tiger Class.
 *
 * @author Bryson Frederick
 */

public class Tiger {
	
	private boolean hasStripes;
	private String color;
	
	/**
	 * The two parameter constructor for the Tiger class.
	 * 
	 * @precondition color != null && !color.isEmpty()
	 * @postcondition this.color == color && this.hasStripes == hasStripes
	 *  
	 * @param hasStripes boolean that tracks whether or not the tiger has stripes
	 * @param color string representation of the tiger's color 
	 */
	public Tiger(boolean hasStripes, String color){
		if (color == null){
			throw new IllegalArgumentException("color cannot be null");
		}
		if (color.isEmpty){
			throw new IllegalArgumentException("color cannot be empty");
		}
		this.hasStripes = hasStripes;
		this.color = color;
	}
	
	/**
	 * Gets whether or not the tiger has stripes.
	 * 
	 * @return true if the tiger has stripes, false otherwise
	 */
	public boolean hasStripes() {
		return hasStripes;
	}
	
	/**
	 * Gets the color of the tiger.
	 * 
	 * @return the color of the tiger as a string
	 */
	public String getColor() {
		return color;
	}
	
	

}
