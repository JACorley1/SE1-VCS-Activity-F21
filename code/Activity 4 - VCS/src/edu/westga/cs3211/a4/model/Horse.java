package edu.westga.cs3211.a4.model;

/**
 * This Horse class will set up the name of the Horse and whether it is vicious
 * 
 * @author Janera Smith
 * @version Fall 2021
 */
public class Horse {
	private String name;
	private boolean isVicious;

	/**
	 * This will set up the Horse object with the specified name of the Horse and
	 * whether the Horse is vicious
	 * 
	 * @precondition name != null && !name.isEmpty()
	 * @postcondition getName() == name && isVicious() == isVicious
	 * 
	 * @param name      the name of the Horse
	 * @param isVicious true if the Horse is vicious; false otherwise
	 */
	public Horse(String name, boolean isVicious) {
		this.setName(name);
		this.isVicious = isVicious;
	}

	/**
	 * Gets the name of the Horse
	 * 
	 * @precondition none
	 * 
	 * @return the name of the Horse
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets the name of the Horse
	 * 
	 * @precondition name != null && !name.isEmpty()
	 * @postcondition getName() == name
	 * 
	 * @param name the name of the Horse to set
	 */
	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("The Horse's name cannot be null");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("The Horse's name cannot be empty");
		}

		this.name = name;
	}

	/**
	 * Checks to see if the Horse is vicious
	 * 
	 * @return true if the Horse is vicious; false otherwise
	 */
	public boolean isVicious() {
		return this.isVicious;
	}
}
