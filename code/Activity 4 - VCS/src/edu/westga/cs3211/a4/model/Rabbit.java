package edu.westga.cs3211.a4.model;

public class Rabbit {
	
	private String color;
	private boolean isSpotted;
	
	/**
	 * Get the color of Rabbit
	 * 
	 * Preconditions: color != null AND !color.isEmpty()
	 * Postconditions: GetColor == color && IsSpotted == isSpotted
	 * 
	 * @param color 	the color of the rabbit
	 * @param isSpotted whether the rabbit is spotted
	 */
	public Rabbit(String color, boolean isSpotted) {
		if(color == null || color.isEmpty()) {
			throw new IllegalArgumentException("Color cannot be null or empty.");
		}
		
		this.color = color;
		this.isSpotted = isSpotted;
	}
	
	/**
	 * Get the color of Rabbit
	 * 
	 * Preconditions: none
	 * Postconditions: none
	 * 
	 * @return the color
	 */
	public String GetColor() {
		return this.color;
	}
	
	
	/**
	 * Returns whether the rabbit is spotted
	 * 
	 * Preconditions: none
	 * Postconditions: none
	 * 
	 * @return true if rabbit is spotted; false otherwise 
	 */
	public Boolean IsSpotted() {
		return this.IsSpotted();
	}
}
