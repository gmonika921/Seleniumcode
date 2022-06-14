package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Footerlist3 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		Thread.sleep(3000);
		
		List <WebElement> footerlist = driver.findElements(By.xpath("//ul[@class = 'footer-nav']/li/a"));
		
		int footerlistnumber = footerlist.size();
		
		System.out.println(footerlistnumber);
		
		for (WebElement e : footerlist) {
			String text = e.getText();
			System.out.println(text);
		}

}
	
	public static void clickonElementfromSelection(By locator, String value) {
		List <WebElement> elelist = driver.findElements(locator);
		
		 System.out.println(elelist.size());
		
		
		for (WebElement e : elelist) {
			String text = e.getText();
			System.out.println(text);
			
			if(text.contains(value)) {
				e.click();
				break;
			}
		}

		
	}
	
	public static void printAllElementsText(By locator) {
		List <WebElement> elelist = driver.findElements(locator);
		
		 System.out.println(elelist.size());
		
		
		for (WebElement e : elelist) {
			String text = e.getText();
			System.out.println(text);
		
	}
	}
	
	public static int getElementListCount(By locator) {
		return driver.findElements(locator).size();
	}
}
