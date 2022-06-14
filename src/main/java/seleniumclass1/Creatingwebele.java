package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Creatingwebele {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		Thread.sleep(4000);
		
		By footerlink = By.xpath("//footer//ul[@class = 'footer-nav']//a");
		
		clickonElementfromselection(footerlink, "Freshsales");
		
		
	}
		
		
		
		public static void clickonElementfromselection(By locator, String value) {
		List<WebElement> elelist = driver.findElements(locator);
		
		System.out.println("The total number of footerlink is :" +elelist.size());
		System.out.println();
		
		for (WebElement e: elelist) {
			String ft = e.getText();
			System.out.println("The name of footer link is :" +ft);
			System.out.println();
			
			if(ft.contains(value)) {
				e.click();
				break;
			}
			
		}

	}
}





