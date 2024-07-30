package sumith.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample3 {
	
	
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser","url"})
	public void test1(String browser,String app) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(app);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(app);
		}
		
	}
	
	@Test
	public void test2() {
		WebElement logo = driver.findElement(By.xpath("(//img[@alt=\"OrangeHRM Logo\"])[1]"));
		Assert.assertTrue(logo.isDisplayed(),"Logo Displayed");
	}
	

}
