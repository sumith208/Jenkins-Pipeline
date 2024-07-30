package sumith.com;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTestNG {
	
	@Test(dataProvider = "LoginPage", dataProviderClass = CustomDataProvider.class)
	public void login(String email, String pwd) {
		System.out.println(email + "  " + pwd);
	}
	
	

}
