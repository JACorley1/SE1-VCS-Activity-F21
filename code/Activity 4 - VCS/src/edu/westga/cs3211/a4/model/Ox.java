package edu.westga.cs3211.a4.model;

public class Ox {
int oxYear;
String oxType;

	public Ox(int year, String type) {
		this.oxYear = year;
		this.oxType = type;
	}

	public Ox() {
		this.oxYear = 1997;
		this.oxType = "Fire";
	}
}
