package sumith.com;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	@DataProvider(name = "LoginPage")
	public Object[][] getData() {
		Object[][] data = {{"xyz@gmail.com","123"},{"amin@gmail.com","778"}};
		return data;
		
	}

}
