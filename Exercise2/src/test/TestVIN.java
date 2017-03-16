package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVIN {
	
	MotorCycle motorCycle = new MotorCycle("Red");
	Car car = new Car("Blue");
	
	@Test
	public void testCarVIN(){
		car.setVIN("1234RKLMN6789123A");
		
		String carVIN = car.getVIN();
		assertEquals(carVIN.length(),17);
	}
	
	@Test
	public void testMotorCycleVIN(){
		motorCycle.setVIN("1234RKLMN6789123A");
		
		String motorCycleVIN = motorCycle.getVIN();
		assertEquals(motorCycleVIN.length(),17);
	}
	
	

}
