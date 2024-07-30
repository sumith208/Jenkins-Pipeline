package sumith.com;

import org.testng.annotations.Test;

public class groupsTag {
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("this is test1");
	}
	@Test(groups = {"sanity","regression"})
	public void test2() {
		System.out.println("this is test2");
	}
	@Test(groups = {"sanity"})
	public void test3() {
		System.out.println("this is test3");
	}@Test(groups = {"regression"})
	public void test4() {
		System.out.println("this is test4");
	}

}
