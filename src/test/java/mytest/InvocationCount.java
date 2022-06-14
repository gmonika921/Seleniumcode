package mytest;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount = 10)
	
	public void homePageTest() {
		System.out.println("home page test");
		
	}

}
