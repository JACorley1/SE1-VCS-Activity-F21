package edu.westga.cs3211.a4.model;

/**
 * Ox class
 * @author Tyler Coltrain
 *
 */
public class Ox {
private int oxYear;
private String oxType;

/**
 * creates an Ox with the given year and type
 * @param year	year of the ox
 * @param type	type of the ox
 */
	public Ox(int year, String type) {
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
	 * @return year of the ox
	 */
	public int getOxYear() {
		return this.oxYear;
	}
	
	/**
	 * gets the ox type
	 * @return type of the ox
	 */
	public String getOxString() {
		return this.oxType;
	}
}
