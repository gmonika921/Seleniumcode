package Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigationconcept {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	driver.navigate().back();
	
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().forward();
	
	System.out.println(driver.getCurrentUrl());
	
	driver.navigate().refresh();
	
	driver.close();
	
	
	
		
		
		
	}

}
