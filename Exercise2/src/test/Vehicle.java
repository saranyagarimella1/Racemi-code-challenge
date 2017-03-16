package test;

public abstract class Vehicle {

    private String color;
    protected int wheelCount;

    public Vehicle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getWheelCount() {
        return wheelCount;
    }
}