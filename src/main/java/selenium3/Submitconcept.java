package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Submitconcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	
	driver.findElement(By.id("email")).sendKeys("Monika@gmail.com");
	driver.findElement(By.id("passwd")).sendKeys("test456");
	driver.findElement(By.id("passwd")).submit();
	
	

}
}
