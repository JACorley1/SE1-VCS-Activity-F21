package edu.westga.cs3211.a4.model;

/**
 * The monkey class.
 * @author Steven Carriger
 * @author Matthew Thompson
 * @version Fall 2021
 */
public class Monkey {

	private boolean hasTail;
	private String name;
	
	/**
	 * Creates a new monkey object
	 * @precondition name != null && name.isEmpty() != true
	 * @postcondition this.hasTail = hasTail, this.name = name
	 * @param hasTail the value of whether the monkey has a tail or not
	 * @param name the name of the monkey
	 */
	public Monkey(boolean hasTail, String name){
		if (name == null){
			throw new IllegalArgumentException("name cannot be null");
		}
		if (name.isEmpty()){
			throw new IllegalArgumentException("name cannot be empty");
		}
		this.name = name;
		this.hasTail = hasTail;
	}

	/**
	 * the value of whether the monkey has a tail or not.
	 * @return true if the monkey has a tail, false otherwise
	 */
	public boolean isHasTail() {
		return hasTail;
	}

	/**
	 * gets the name of the monkey
	 * @return the name of the monkey
	 */
	public String getName() {
		return name;
	}
}