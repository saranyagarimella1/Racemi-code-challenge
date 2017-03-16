package test;

public class Main {

	public static void main(String[] args) {
	  Vehicle motorCycle = new MotorCycle("red");
	  motorCycle.wheelCount = 2;
	  
	  Vehicle skateBoard = new SkateBoard("yellow");
	  skateBoard.wheelCount = 4;
	  Vehicle car = new Car("blue");
	  car.wheelCount = 4;
	  System.out.println("color of motorCycle is : " + motorCycle.getColor());
	  System.out.println("No.of wheels in a motorCycle: " + motorCycle.getWheelCount());
	  System.out.println("color of skateBoard is : " + skateBoard.getColor());
	  System.out.println("No.of wheels in a skateBoard: " + skateBoard.getWheelCount());
	  System.out.println("color of car is : " + car.getColor());
	  System.out.println("No.of wheels in a car: " + car.getWheelCount());
	}

}
