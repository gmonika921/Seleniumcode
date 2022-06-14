package mytest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderCocept extends BaseTest {
	
	@DataProvider
	public Object[][] getLoginData() {
		return new Object[][] {
			{"test121213@gmail.com", "45hdfiureji"},
			{"test@12@gmail.com", "moni121314"},
			{"abchdgfh2", "1345667"},
			{"$^%&^*&&" ,"45665737"},
			{"   ","  "}
			
			
		};
	}
	
	@Test(dataProvider = "getLoginData")
	public void loginTest(String username, String password) {
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String errMsg = driver.findElement(By.cssSelector("div.alert.alert-danger.alert-dismissible")).getText();
		System.out.println(errMsg);
		
		Assert.assertTrue(errMsg.contains("Warning: No match for E-Mail Address and/or Password."));
	}
	
	

}
