package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util {
	
	public WebDriver driver;

	public static void main(String[] args) {

	}
	
	public WebDriver init_driver (String Browsername) {
		System.out.println("browser name is :"  +Browsername);
		if (Browsername.equalsIgnoreCase(CHROME_BROWSER)) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		
		else if (Browsername.equalsIgnoreCase(FIREFOX_BROWSER)) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
	}
		
		else  if (Browsername.equalsIgnoreCase(SAFARI_BROWSER)) {
			
			driver = new SafariDriver();
		}
		
		else {
			
			System.out.println("Please enter the valid browser: " +Browsername);
		}
		
		return driver;
	}
	

	@Override
	public void navigate(String url) {
		
		if (url == null) {
			return;
		}
		
		if (url.isEmpty()) {
			return;
		}
		
		if (url.indexOf("http") == -1 && url.indexOf("https") == -1) {
			System.out.println("Please pass the right url http(s) is missing");
			return;
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
	public void closeBrowser(){
		driver.close();
		
	}

	@Override
	public void quitBrowser() {
		
		driver.quit();
		
	}

}
