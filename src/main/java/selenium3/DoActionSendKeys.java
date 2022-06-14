package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoActionSendKeys {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		Thread.sleep(4000);
		By Firstname = By.id("Form_submitForm_FirstName");
		By  lastname = By.id("Form_submitForm_LastName");
		By Bookafreedemobtn = By.xpath("//a[@class = 'btn-orange trial-btn pulse ']");
		By Contactsales = By.xpath("//a[@class = 'btn-orange contact-ohrm ']");
		
		
	
		
//		Actions act = new Actions(driver);
//		act.sendKeys(driver.findElement(Firstname), "Monika").perform();
//		act.sendKeys(driver.findElement(lastname), "Gupta").perform();
		
		doActionsSendKeys(Firstname, "Monika");
		doActionsSendKeys(lastname, "Gupta");
		Thread.sleep(2000);
		doActionsClick(Bookafreedemobtn);
		doActionsClick(Contactsales);
				
		
}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator),value).perform();
				
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
				
	}
}
