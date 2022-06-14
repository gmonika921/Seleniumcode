package selenium3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Psuedoelements {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
	String mand_fields= 	js.
		executeScript
		("return window.getComputedStyle(document.querySelector(\"label[for = 'input-lastname']\"),'::before').getPropertyValue('content')")
		.toString();
	
	System.out.println(mand_fields);
				



}
	
}
