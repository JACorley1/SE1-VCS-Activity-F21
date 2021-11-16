package edu.westga.cs3211.a4.model;

public class Dragon {
    private String color;
    private int wingspan;

    /**
     * Creates a dragon with a specified color and wingspan.
     * @precondition color != null && !color.isEmpty() && wingspan > 0
     * @postcondition this.getColor() == color && this.getWingspan() == wingspan
     * @param color The specified color
     * @param wingspan The specified wingspan
     */
    public Dragon(String color, int wingspan) {
    	if (color == null) {
    		throw new IllegalArgumentException("color must not be null");
    	}
    	if (color.isEmpty()) {
    		throw new IllegalArgumentException("color must not be empty");
    	}
    	if (wingspan <= 0) {
    		throw new IllegalArgumentException("wingspan must be positive");
    	}
        this.color = color;
        this.wingspan = wingspan;
    }

    /**
     * Gets the wing span.
     * @precondition None
     * @postcondition None
     * @return the wing span
     */
    public int getWingspan() {
        return this.wingspan;
    }

    /**
     * Gets the color.
     * @precondition None
     * @postcondition None
     * @return the color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color.
     * @precondition color != null && !color.isEmpty()
     * @postcondition this.getColor() == color
     * @param color the new color
     */
    public void setColor(String color) {
    	if (color == null) {
    		throw new IllegalArgumentException("color must not be null");
    	}
    	if (color.isEmpty()) {
    		throw new IllegalArgumentException("color must not be empty");
    	}
        this.color = color;
    }

    /**
     * Sets the wingspan.
     * @precondition wingspan > 0
     * @postcondition this.getWingspan() == wingspan
     * @param wingspan the new wingspan
     */
    public void setWingspan(int wingspan) {
    	if (wingspan <= 0) {
    		throw new IllegalArgumentException("wingspan must be positive");
    	}
        this.wingspan = wingspan;
    }
}
