package Selenium2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util {
	
	public WebDriver driver;
	
	
	public WebDriver initialise (String browsername) {
		System.out.println("Browser name is:"  +browsername);
		
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver();
			
			break;
			
		case "safari":
			WebDriverManager.chromedriver().setup();
	
			break;

		default:
			System.out.println("Please enter the valid browser");
			break;
		}
		
		return driver;
	}
	

	@Override
	public void navigateurl(String url) {
		
		if (url==null) {
			System.out.println("The url is null");
			return;
		}
		
		else if (url.isEmpty()) {
			System.out.println("The url enetered is empty");
			return;
		}
		
		else if (url.indexOf("http")==-1 && url.indexOf("https") == -1){
			
		}
		
		else {
			System.out.println("Please enter the correct url :" +url);
		}
		
		driver.get(url);
		
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
		
	}

	@Override
	public String getPageURL() {
		return driver.getPageSource();
		
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
    	
	}

	@Override
	public void close() {
    driver.close();		
	}

	@Override
	public void quit() {
     driver.quit();	
	}

	
}
