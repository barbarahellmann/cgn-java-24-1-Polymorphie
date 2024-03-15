package de.neuefische;

public class Violin extends Instrument{

    private int numberOfStrings;

    public Violin(double price, String color, int numberOfStrings) {
        super(price, color);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void makeNoise(){
        System.out.println("The Violin plays a beautiful sound");
    }


}
