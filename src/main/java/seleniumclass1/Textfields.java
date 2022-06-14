package seleniumclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textfields {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		Elementutil e2util = new Elementutil(driver);
		
		By textfields = By.className("form-control");
		
		By totallinks = By.tagName("a");
		
		By totalimages = By.tagName("img");
		
		int tf = e2util.getElementscount(textfields);
		int tl = e2util.getElementscount(totallinks);
		int ti = e2util.getElementscount(totalimages);
		
		System.out.println("Total fields :"+tf );
		System.out.println("Total links :" +tl );
		System.out.println("Total images :" +ti );
		
		driver.close();
		


}
	
}	
	
