package de.neuefische;

import java.util.Objects;

//Elternklasse -> Superklasse genannt
public class Instrument implements CanMakeNoise{

    public static String material = "Wood";
    private double price;
    private String color;

    public Instrument(double price, String color) {
        this.price = price;
        this.color = color;
    }


    public void changeMaterial(String newMaterial){
        material = newMaterial;
    }

    public String getMaterial(){
        return material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
        System.out.println("Instument Sounds");
    }

    @Override
    public void getLouder() {
        System.out.println("The Instrument plays louder!!");
    }
}
