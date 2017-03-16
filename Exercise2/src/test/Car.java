package test;

public class Car extends Vehicle {
	
	private String VIN;

	public Car(String color) {
		super(color);
	}

	public String getVIN() {
		return VIN;
	}

	public void setVIN(String VIN) {
		this.VIN = VIN;
	}

}
