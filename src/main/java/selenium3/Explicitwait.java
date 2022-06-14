package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicitwait {
	
	static WebDriver driver;

	public static void main(String[] args) {

		// Explicit wait - Dynamic wait

		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		By name = By.id("Form_submitForm_FirstName");

		By last_name = By.id("Form_submitForm_LastName");

		By email = By.id("Form_submitForm_Email");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		WebElement name_ele = wait.until(ExpectedConditions.presenceOfElementLocated(name));
//		name_ele.sendKeys("Monika");
		
//		driver.findElement(last_name).sendKeys("Gupta");
//		driver.findElement(email).sendKeys("monika@gmail.com");
		waitForElementPresent(5, name).sendKeys("Monika");
		getElement(last_name).sendKeys("Gupta");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static WebElement waitForElementPresent(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	public static WebElement waitForElementVisible(int timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
