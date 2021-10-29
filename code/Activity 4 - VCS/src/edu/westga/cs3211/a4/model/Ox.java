package edu.westga.cs3211.a4.model;

/**
 * Ox class
 * 
 * year = year of the ox 
 * type = type of the ox
 * 
 * @author Tyler Coltrain
 *
 */
public class Ox {
	private int oxYear;
	private String oxType;

	/**
	 * creates an Ox with the given year and type
	 * 
	 * @precondition year % 12 = 5
	 * @param year year of the ox
	 * @param type type of the ox
	 */
	public Ox(int year, String type) {
		if (year % 12 != 5) {
			throw new IllegalArgumentException("Invalid ox year");
		}
		if (type == null) {
			throw new IllegalArgumentException("Type cannot be null");
		}
		if (type.isEmpty()) {
			throw new IllegalArgumentException("Type cannot be empty");
		}
		this.oxYear = year;
		this.oxType = type;
	}

	/**
	 * default constructor of an Ox
	 */
	public Ox() {
		this.oxYear = 1997;
		this.oxType = "Fire";
	}

	/**
	 * gets the ox year
	 * 
	 * @return year of the ox
	 */
	public int getOxYear() {
		return this.oxYear;
	}

	/**
	 * gets the ox type
	 * 
	 * @return type of the ox
	 */
	public String getOxType() {
		return this.oxType;
	}
}
