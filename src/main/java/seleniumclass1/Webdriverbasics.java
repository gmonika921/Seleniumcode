package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriverbasics {

	public static void main(String[] args) {

		
//		System.setProperty("webdriver.chrome.driver", "c:\\DevelopmentL\\Reference\\chromedriver.exe");
//		
		
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
		
//		driver.get("https://www.google.com/");
		
        driver.get("https://www.amazon.co.uk/");
        
//        WebDriverManager.chromedriver().setup();
//        
//        WebDriverManager.firefoxdriver().setup();
//        
//        WebDriverManager.edgedriver().setup();
        
        System.out.println(driver.getTitle());
        
        driver.close();
     
        
        
		
		
		


	}

}
