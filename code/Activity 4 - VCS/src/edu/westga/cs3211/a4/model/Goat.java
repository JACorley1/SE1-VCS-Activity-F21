package edu.westga.cs3211.a4.model;

public class Goat {
	private int age;
	private boolean isAlive;
	
	public Goat(int goatAge, boolean isAlive) {
		this.age = goatAge;
		this.isAlive = isAlive;
	}

	public int getAge() {
		return age;
	}

	public boolean isAlive() {
		return isAlive;
	}
}
