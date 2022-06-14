package mytest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemocartTest extends BaseTest {

	@Test(priority = 1)
	public void titleTest() {
		Assert.assertEquals(driver.getTitle(), "Register Account");
	}

	@Test(priority = 2)
	public void currentURLTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is : " + url);
		Assert.assertTrue(url.contains("route=account/register"));

	}

}
