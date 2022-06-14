package Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class headlessIncognito {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		
//		co.setHeadless(true);
//		co.addArguments("--headless");
		
		co.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
	}

}
