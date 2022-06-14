package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxandedgeexam {

	public static void main(String[] args) {

		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver1 = new FirefoxDriver();
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver2 = new EdgeDriver();
		
		
		driver1.get("https://www.google.com");
	}

}
