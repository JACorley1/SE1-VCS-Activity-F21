package edu.westga.cs3211.a4.model;

public class Pig {
	
	private String name;
	private int serialNumber;
	/*
	 * defines a pig object
	 * @precondition - name!= null && !name.isEmpty()
	 * 
	 * @param name - the name of the pig
	 * @param serialNumber - the pigs serial number
	 * 
	 */
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
