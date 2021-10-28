package edu.westga.cs3211.a4.model;

public class Goat {
	private int age;
	private boolean isAlive;
	
	/**
	 * constructs a goat 
	 * 
	 * @postconditon getAge == goatAge && isAlive() == isAlive
	 * @precondition goatAge > 0
	 * 
	 * @param goatAge the age of the goat
	 * @param isAlive if the goat is alive
	 */
	public Goat(int goatAge, boolean isAlive) {
		if (goatAge < 0) {
			throw new IllegalArgumentException("Age must be > 0");
		}
		
		this.age = goatAge;
		this.isAlive = isAlive;
	}

	/**
	 * gets the age of the goat
	 * 
	 * @return the goat's age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * is goat alive
	 * 
	 * @return true if goat is alive, false otherwise
	 */
	public boolean isAlive() {
		return isAlive;
	}
}
