package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSindex {

	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		String linkname = driver.findElement(By.cssSelector("ul.footer-nav>li:nth-of-type(3)>a")).getText();
		
		System.out.println(linkname);
		
		
		
		

}
}


