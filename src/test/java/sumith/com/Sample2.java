package sumith.com;

import org.testng.annotations.Test;

public class Sample2 {

	

	@Test(priority = 4)
	public void a1() {
		System.out.println("Setup1");
	}
	@Test(priority = 5)
	public void A2() {
		System.out.println("Sample TC1");
	}
	@Test(priority = 6)
	public void Abc3() {
		System.out.println("Closing1");
	}
}
