package de.neuefische;

public class Main {

    public static void main(String[] args) {

        Piano piano = new Piano(
                3000.00, "Black", 12
        );

        Violin violin = new Violin(
                200.00, "Red", 4
        );

        System.out.println(piano.getMaterial());
        System.out.println(violin.getMaterial());
        violin.changeMaterial("Metal");
        Instrument.material = "Rubber";
        System.out.println(piano.getMaterial());
        System.out.println(violin.getMaterial());


    }

    //Polymorphism
    public static void printInstrument(Instrument instrument){
        System.out.println(instrument);
    }
}