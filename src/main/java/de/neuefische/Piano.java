package de.neuefische;

public class Piano extends Instrument{

    private int numberOfOctaves;

    public Piano(double price, String color, int numberOfOctaves) {
        super(price, color);
        this.numberOfOctaves = numberOfOctaves;
    }

    public int getNumberOfOctaves() {
        return numberOfOctaves;
    }

    public void setNumberOfOctaves(int numberOfOctaves) {
        this.numberOfOctaves = numberOfOctaves;
    }



    @Override
    public String toString() {
        return "Piano{" +
                "numberOfOctaves=" + numberOfOctaves +
                "} " + super.toString();
    }
}
