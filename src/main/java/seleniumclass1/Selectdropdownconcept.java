package seleniumclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownconcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_submitForm_Country");
		
//		WebElement country_ele = driver.findElement(country);
//		
//		Select select = new Select(country_ele);
//		
//		select.selectByIndex(6);
		
//		select.selectByValue("India");
		
//		select.selectByVisibleText("Egypt");
		
//		Thread.sleep(4000);
		
		doselectdropdownbyindex(country, 10);
		
		doselectdropdownbyvalue(country, "India");
		
		doselectdropdownbyVisiletext(country, "Egypt");
		
		
		
		
		
		
		
		
		
		
		

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}
	
	public static void doselectdropdownbyindex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
		
	public static void doselectdropdownbyvalue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
		
	}
	
	public static void doselectdropdownbyVisiletext(By locator, String VisibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);	
	}

}
