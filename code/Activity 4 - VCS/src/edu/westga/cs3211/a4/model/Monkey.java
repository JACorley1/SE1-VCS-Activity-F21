package edu.westga.cs3211.a4.model;

public class Monkey {

	private boolean hasTail;
	private String name;
	
	public Monkey(boolean hasTail, String name){
		if (hasTail == null){
			throw new IllegalArgumentException("hasTail cannot be null");
		}
		if (name == null){
			throw new IllegalArgumentException("name cannot be null");
		}
		if (name.isEmpty()){
			throw new IllegalArgumentException("name cannot be empty");
		}
		this.name = name;
		this.hasTail = hasTail;
	}
}
