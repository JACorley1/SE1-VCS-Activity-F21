package edu.westga.cs3211.a4.model;

public class Snake {

	private double length;
	private boolean venomous;
	
	public Snake(double length, boolean isVenomous) {
		if (length <= 0) {
			throw new IllegalArgumentException("Snake length must be greater than zero");
		}
		this.length = length;
		this.venomous = isVenomous;
	}
	
	public 
}
