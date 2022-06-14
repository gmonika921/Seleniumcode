package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicprac1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String til = driver.getTitle();
		
		System.out.println(til);
		
		if (til.equalsIgnoreCase("google")) {
			
			System.out.println("It's a correct title");
		}
		
		else {
			
			System.out.println("it's not a correct title");
		}
		
//	String PS = driver.getPageSource();
		
//		System.out.println(PS);
		
		String CR= driver.getCurrentUrl();
		
		System.out.println(CR);
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		

	}

}
