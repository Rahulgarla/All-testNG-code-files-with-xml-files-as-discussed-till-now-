package TestNG;

import org.testng.annotations.Test;

public class Day2 {
	
	@Test(groups={"smoke"})
	public void car() {
		System.out.println("Car has four wheels");
	}
	
	@Test
	public void bike() {
		System.out.println("Bike has only two wheels");
	}
	
	@Test(groups={"smoke"})
	public static void cycle() {
		System.out.println("Need to ride requires lot of energy");
	}
}
