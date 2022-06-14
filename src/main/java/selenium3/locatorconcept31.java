package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class locatorconcept31 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		String firstname = "input-firstname";
		
//		By lastname = By.id("input-lastname");
		
		String lastname = "input-lastname";
		
		By cont= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		By text = By.className("alert");
		
//		String email = ("#input-email");
		
		By login = By.linkText("Login");
		By Register = By.linkText("Register");
		By forpwd = By.linkText("Forgotten Password");
		
		
		
//		doSendKeys(firstname, "monika");
//		doSendKeys(lastname, "Gupta");
		
		doSendKeys(getBy("id", firstname), "monika123");
		doSendKeys(getBy("id", lastname), "gupta123");
//		doclick(cont);
//		String mesg = dogetElementText(text);
		
//		doSendKeys(getBy("cssSelector", email), "gmonika");
//		doclick(login);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		doclick(Register);
//		driver.navigate().back();
//		Thread.sleep(2000);
		doclick(forpwd);
		
//		System.out.println(mesg);
		
//		if (mesg.contains("Warning")) {
//			System.out.println("Its an alert message");
//		}
//		else {
//			System.out.println("Its not an alert message");
//		}
		
		
		
		
		
		
		
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doclick(By locator) {
		getElement(locator).click();
	}
	
	public static String dogetElementText(By locator) {
		return getElement(locator).getText();
		
	}
	public static By getBy(String locatortype, String locatorvalue) {
		
		By locator = null;
		
		switch (locatortype.toLowerCase()) {
		case "id":
			locator = By.id(locatorvalue);
			break;
			
		
		case "name":
			locator = By.name(locatorvalue);
			break;
			
			
		case "className":
			locator = By.className(locatorvalue);
			break;
			
		case "xpath":
			locator = By.xpath(locatorvalue);
			break;
			
		case "linkText":
			locator = By.linkText(locatorvalue);
			break;
			
		case "partialLinkText":
			locator = By.partialLinkText(locatorvalue);
			break;
			
		case "cssSelector":
			locator = By.cssSelector(locatorvalue);
			break;
			
		case "tagName":
			locator = By.tagName(locatorvalue);
			break;

		default:
			
			
			System.out.println("Please pass the valid locator :" +locator);
			
			break;
		}
		
		return locator;
	}

}
