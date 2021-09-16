package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day3 {
	@Test
	public void webLogin() {
		System.out.println("Day3 WebLogin");
	}
	
	@Test
	public void mobileLogin() {
		System.out.println("Day3 MobileLogin");
	}
	
	@Test
	public void desktopLogin() {
		System.out.println("Day3 DesktopLogin");
	}
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("Executed before each method in day 3");
//	}
//	
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("Executed after each method in day 3");
//	}
	

}
