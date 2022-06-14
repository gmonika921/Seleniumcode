package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

// Running the code without launching browser and is very fast
// Headless - no browser window
// improved performance of the script
// complex UI - might not work
// We can use headless mode when we are working in laptop and windows are disturbing...
// Sometimes for quick sanity - we can run in incognito mode, so we can finish off quickly but it is not 
// recommended to do so.... even from client side there is no requirmenet to check the code in headless mode...


public class Headlessconcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions co = new ChromeOptions();
//		co.setHeadless(true);
		
		co.addArguments("--headless");
		
//		for firefox
		
//		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.setHeadless(true);
		
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
		

	}

}
