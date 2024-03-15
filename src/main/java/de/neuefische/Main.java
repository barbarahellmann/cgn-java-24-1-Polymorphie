package de.neuefische;

public class Main {

    public static void main(String[] args) {

        Piano piano = new Piano(
                3000.00, "Black", 12
        );

        Violin violin = new Violin(
                200.00, "Red", 4
        );

        violin.makeNoise();

        printInstrument(piano);
        printInstrument(violin);

    }

    public static void printInstrument(Instrument instrument){
        System.out.println(instrument);
    }
}