package edu.westga.cs3211.a4.model;

public class Pig {
	
	private String name;
	private int serialNumber;
	
	public Pig(String name, int serialNumber) {
		if(name == null) {
			throw new IllegalArgumentException("Name cant be null");
		}
		if(name.isEmpty()) {
			throw new IllegalArgumentException("Name cant be empty");
		}
		this.name = name;
		this.serialNumber = serialNumber;
		
	}
	
	
	public int getNumber() {
		return this.serialNumber;
	}
	
	public String getName() {
		return this.name;
	}

}
