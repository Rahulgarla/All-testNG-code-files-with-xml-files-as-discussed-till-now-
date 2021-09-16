package TestNG;

import org.testng.annotations.Test;

//In testng the order of execution will always be in alphabetical order inside a class

/*
 * Hierarchy in xml file:
 * test suite -> test tags -> classes -> class -> methods
 *  In testng, we use annotations to control the test cases
 *  Annotations:
 *  @BeforeTest
 *  @AfterTest
 *  @BeforeMethod
 *  @AfterMethod
 *  @BeforeSuite
 *  @AfterSuite
 *  
 *  Groups Function:
 *  For executing specific test cases from different class files we can group them together
 *  Eg-> @Test(groups={"smoke"}) ->this is the syntax for test cases in group function
 *  
 *  Depend on method:
 *  Defines the method on which the current method is dependent on.
 *  Eg-> @Test(dependsOnMethods={"methodName"})
 *  
 */

public class Devices {
	@Test
	public void mobileIphone() {
		System.out.println("Devices Iphone");
	}
	@Test
	public void macbookDependency() {
		System.out.println("This is macbook dependency");
	}
	@Test(groups={"smoke"},enabled=false,dependsOnMethods={"macbookDepency"})
	public void laptopMacbook() {
		System.out.println("Devices Macbook");
	}
	@Test(dependsOnMethods={"dependOn"})
	public void laptopHp() {
		System.out.println("Devices Hp");
	}
	@Test
	public void laptopLenovo() {
		System.out.println("Devices Lenovo");
	}
	@Test
	public void mobileSamsung() {
		System.out.println("Devices Samsung");
	}
	@Test
	public void mobileOppo() {
		System.out.println("Devices Oppo");
	}
	@Test
	public void dependOn() {
		System.out.println("This method depends on method in devices");
	}

}
