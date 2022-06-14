package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangehrmTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "Sign Up for a Free HR Software Demo | OrangeHRM");

	}

	@Test(priority = 2)
	public void currentURLTest() {
		
		String url = driver.getCurrentUrl();
		System.out.println("page url is : " + url);
		Assert.assertTrue(url.contains("www.orangehrm.com"));

		

	}

}
