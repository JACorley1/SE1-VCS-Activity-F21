package edu.westga.cs3211.a4.model;

public class Dragon {
    private String color;
    private int wingspan;

    /**
     * Creates a dragon with a specified color and wingspan.
     * @param color The specified color
     * @param wingspan The specified wingspan
     */
    public Dragon(String color, int wingspan) {
        this.color = color;
        this.wingspan = wingspan;
    }

    /**
     * Gets the wing span.
     * @return the wing span
     */
    public int getWingspan() {
        return this.wingspan;
    }

    /**
     * Gets the color.
     * @return
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Sets the color.
     * @param color the new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Sets the wingspan.
     * @param wingspan the new wingspan
     */
    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }
}
