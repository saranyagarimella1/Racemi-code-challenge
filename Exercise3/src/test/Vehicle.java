package test;

public abstract class Vehicle {

    private String color;
    
    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}