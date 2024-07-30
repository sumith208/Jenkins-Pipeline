package sumith.com;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class JavaScriptExecutor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//
//		// flash
////		click action
////		add border take screenshots
//		 WebElement ele = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
//		js.executeScript("arguments[0].style.border='3px solid red'",ele);
//		
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File(".\\ScreenShots\\nop.png");
//		try {
//			FileUtils.copyFile(src, target);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		JavaScriptUtil.drawBorder(driver, ele);
//		Refresh the page
//		zoom in and out
//		scroll down and up 
//		Window Handles
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		WebElement ele = driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
//		js.executeScript("arguments[0].click()", ele);
//		Set<String> set = driver.getWindowHandles();
//		List<String> lst = new ArrayList<String>(set);
//		String parent = lst.get(0);
//		String child = lst.get(1);
//		System.out.println(parent);
//		System.out.println(child);
//	    System.out.println(driver.getTitle());
//		driver.switchTo().window(parent);
//	    System.out.println(driver.getTitle());
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER);
		act.sendKeys(Keys.ESCAPE);
		act.sendKeys(Keys.BACK_SPACE);
		act.sendKeys(Keys.SPACE);

		
		
		

	}

}
