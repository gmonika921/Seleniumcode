package seleniumclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsconcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
//		There are 7 locators strategy which we can use. In all case we are creating web element and performing actions.
//		1. By using driver.findelements(By.id()).sendkeys where we are writing directly.
//		2. In second case we are storing in web element = driver.findelement ones and then writing in separate
//		line for actions for e.g. web element.send keys.
		
		
	
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
//		1. id
		
//		driver.findElement(By.id("input-email")).sendKeys("monika@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
//		2. By storing the web element in driver.find element concept then performing actions on that.
//		we are creating the web element and each time making server busy by asking to find the web element
//		not a good approach. Here we are sending req to server please find elements, so if we have 50 by locators then
//		we need to send 50 request.
		
//		WebElement emailid = driver.findElement(By.id("input-email"));
//		
//		WebElement passowrd = driver.findElement(By.id("input-password"));
//		
//		emailid.sendKeys("monika@gmail.com");
//		passowrd.sendKeys("test@123");
		
//		3.  By locator - By using the by class from selenium, here we are just storing the 
//		email and password in By class. for e.g. we created 50 by locator then out of 50, 
//		we have created 20 web element and sending keys, so here we are not sending request for 50 by locators to 
//		search the element..
		
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement ele_email = driver.findElement(email);
//		
//		WebElement ele_pwd = driver.findElement(password);
//		
//		ele_email.sendKeys("monika@123");
//		ele_pwd.sendKeys("test@123");
		
//		4. By locator with generic method get element
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		getElement(email).sendKeys("monika@gmail.com");
//		getElement(pwd).sendKeys("test@123");
		
//		5. By locator with generic method - locators method + actions method --> getElement and dosendkeys method
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		dosendkeys(email, "monika@gmail.com");
//		dosendkeys(pwd, "test@123");
		
//		6. By locator OR (object repository) with generic method in Element Util class
		
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		Elementutil eutil = new Elementutil(driver);
//		
//		eutil.dosendkeys(email, "gmonika@gmail.com");
//		eutil.dosendkeys(pwd, "test@123");
//		
		
//		7. String locator OR with generic method in Element Util class
		   String email_id = "input-email";
		   String pwd = "input-password";
		   
		   dosendkeys(getBy("id", email_id), "monika@gmail.com");
		   dosendkeys(getBy("id", pwd), "test@123");
		   
		   
	}
	
	public static By getBy (String locatorType, String locatorvalue) {
		
		By locator = null;
		
		switch (locatorType) {
		case "id":
			locator = By.id(locatorvalue);
			break;

		default:
			System.out.println("Please pass the valid locator :" +locator);
			break;
		}
		
		return locator;
		
	
	}
	
	public static WebElement getElement (By locator) {
		return driver.findElement(locator);
		
	}
	
	public static void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);
		
	}
	
	

}
