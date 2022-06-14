package seleniumclass1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		try {
			driver.navigate().to(new URL ("https://www.amazon.co.uk"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		
		
		
		
		
		
	}

}
