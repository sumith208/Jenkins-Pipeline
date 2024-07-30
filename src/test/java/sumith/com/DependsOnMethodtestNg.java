package sumith.com;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodtestNg {
	
	
	@Test
	public void startCar() {
		System.out.println("Start the car");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = {"startCar"})
	public void stopCar() {
		System.out.println("Stop the car");
	}
	
	@Test(dependsOnMethods = {"startCar","stopCar"}, alwaysRun = true)
	public void parkCar() {
		System.out.println("Park the car");
	}

}
