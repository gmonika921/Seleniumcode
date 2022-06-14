package seleniumclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator3concept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	 driver = new ChromeDriver();
	
	driver.get("https://demo.opencart.com/index.php?route=account/register");
	
	driver.findElement(By.id("input-firstname")).sendKeys("monika");
	
//	String v = driver.findElement(By.id("input-firstname")).getAttribute("value");
//	
//	System.out.println(v);
	
	By name = By.id("input-firstname");
	
	doSendkeys(name, "monika1234");
	System.out.println(getAttribute(name, "value"));
	
	boolean b = isDisplayed(name);
	
	System.out.println(b);
	
	
	
	
	
	
	
	
	

	}
	
	public static boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
	}
	
	public static String getAttribute(By locator, String value ) {
		return getElement(locator).getAttribute(value);
	}
    
	public static void doSendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	
	}
}
