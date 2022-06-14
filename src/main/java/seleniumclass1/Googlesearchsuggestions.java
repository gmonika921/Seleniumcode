package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearchsuggestions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
//		ChromeOptions co = new ChromeOptions();
//		
//		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("q")).sendKeys("Monika gupta");
		
		Thread.sleep(6000);
		
	
	
		
	By sugglists = By.xpath("//ul[@role=\"listbox\"]/li//div[@class='wM6W7d']//span");
		
		List<WebElement> sugglist = 
				driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li//div[@class='wM6W7d']//span"));
		
		System.out.println("Total number of suggestion is : " +sugglist.size());
		
		for (WebElement e : sugglist) {
			
			String text = e.getText();
			
			System.out.println(text);
			
			Thread.sleep(4000);
			
			if (text.contains("monika gupta instagram")) {
				e.click();
				break;
			}
			
			
			
		}
	}
	
}



