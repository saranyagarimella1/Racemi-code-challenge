package test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

	public static void main(String[] args) {
		Vehicle boat = new Boat("green");
		System.out.println("color of boat: "+boat.getColor());
	}

}
