package de.neuefische;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Violin violin = (Violin) o;
        return numberOfStrings == violin.numberOfStrings;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfStrings);
    }

    @Override
    public String toString() {
        return "Violin{" +
                "numberOfStrings=" + numberOfStrings +
                "} " + super.toString();
    }
}
