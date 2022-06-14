package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Characterseqconcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		String str = "Monika";
		
		String str1 = "is";
		
		StringBuilder str2 = new StringBuilder("the");
		
		StringBuffer str3 = new StringBuffer("best");
		
		
		
		driver.findElement(By.id("email")).sendKeys(str +str1 +str2 +str3);
		
		

}
}
