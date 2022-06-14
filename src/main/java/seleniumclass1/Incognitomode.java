package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incognitomode {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions oc = new ChromeOptions();
		
		oc.addArguments("--incognito");
		
		
		WebDriver driver = new ChromeDriver(oc);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		

	}

}
