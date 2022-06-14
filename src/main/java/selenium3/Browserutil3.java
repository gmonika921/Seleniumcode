package selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserutil3 implements Utilinterface3{
	
	static WebDriver driver;
	
	public WebDriver initialiseBrowser(String browsername) {
		
		System.out.println("Browser name is :" +browsername);
		
		if (browsername.equalsIgnoreCase(CHROME_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		

		else if  (browsername.equalsIgnoreCase(SAFARI_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		

		else if (browsername.equalsIgnoreCase(FIREFOX_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else {
			System.out.println("Please enter the valid browsername :" +browsername);
		}
		
		return driver;
		
	}

	@Override
	public void navigateUrl(String url) {
		
		if(url==null) {
			System.out.println("You enetered the null url");
			return;
		}
		
		else if (url.isEmpty()) {
			System.out.println("The url is empty");
			return;
		}
		
		
		else if (url.indexOf("http")== -1 & url.indexOf("https") == -1) {
			System.out.println("https and http is missing from url");
			return;
		}
		driver.get(url);
		
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
		
		
	}

	@Override
	public String getPageUrl() {
		return driver.getCurrentUrl();
		
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
		
		
	}

	@Override
	public void closeBrowser() {
		driver.close();
		
		
	}

	@Override
	public void quitBrowser() {
		driver.quit();
		
		
	}


}
