package test;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestBoat {
	Vehicle boat = new Boat("Green");
	
	@Test
	
	public void testColor(){
		assertEquals(boat.getColor(),"Green");
	}
}
