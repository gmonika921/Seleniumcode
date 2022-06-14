package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorconcept32 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By firstname = By.id("input-firstname");
		
//		String header = driver.findElement(By.tagName("h1")).getText();
//		String header = driver.findElement(By.tagName("h1")).getAttribute("class");
//		System.out.println(header);

		

//		
//		System.out.println(header);
		
//		String cl = driver.findElement(firstname).getAttribute("class");
//		
//		System.out.println(cl);
		
		String cl2 = getAttributeOfElement(firstname, "name");
		System.out.println(cl2);
		
		

}
	
	public static String getAttributeOfElement(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
