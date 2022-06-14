package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownconcept3 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_submitForm_Country");
		
		WebElement country_ele = driver.findElement(country);
		
		Select select = new Select(country_ele);
		
//		select.selectByIndex(5);
//		
//		select.deselectByVisibleText("India");
//		
//		select.selectByValue("Brazil");
//		
			
}
	
	public static void doSelectDropDownByVIsibleText(By locator, String VisibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
		
	}
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.deselectByValue(value);
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
}
