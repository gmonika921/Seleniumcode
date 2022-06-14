package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "Google");

	}

	@Test(priority = 2)
	
	public void currentURLTest() {
		String url = driver.getCurrentUrl();
		
		System.out.println(url);

		Assert.assertTrue(url.contains("google"));

	}

}
