package selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognitomode3 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
		
//		co.setHeadless(true);
		
//		co.addArguments("--headless");
		
		co.addArguments("--incognito");
		
		driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.amazon.co.uk/");
		
		driver.navigate().back();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		
	}

}
