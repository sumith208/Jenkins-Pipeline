package sumith.com;

import org.testng.annotations.Test;

public class Sample {
	
	@Test(priority = 1)
	public void a() {
		System.out.println("Setup");
	}
	@Test(priority = 2)
	public void A() {
		System.out.println("Sample TC");
	}
	@Test(priority = 3)
	public void Abc() {
		System.out.println("Closing");
	}
}