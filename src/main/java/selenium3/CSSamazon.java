package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSamazon {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
//		driver.get("https://www.amazon.com/");
		
//		freshworks.com
		
		driver.get("https://www.freshworks.com/");
		
		
//		List<WebElement> footerlinks = driver.findElements(By.cssSelector("div.navFooterVerticalRow.navAccessibility a"));
		
		List<WebElement> footerlinks = driver.findElements(By.cssSelector("div.footer-main a"));
		
		for  (WebElement e : footerlinks) {
			
//			ArrayList<String> list  = new ArrayList<String>();
			
			String text = e.getText();
			
			System.out.println(text);
			
		}
		
		
		 
		
		
		

	}

}
