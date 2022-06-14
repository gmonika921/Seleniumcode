package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	public WebDriver driver;
	
	public void doSendkeys(By locator, String locatorvalue) {
		getElement(locator).sendKeys(locatorvalue);
	}

	public WebElement getElement (By Locator) {
		return driver.findElement(Locator);
	}
	
	

}
