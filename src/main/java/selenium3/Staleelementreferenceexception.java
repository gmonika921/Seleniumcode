package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Staleelementreferenceexception {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement userid = driver.findElement(By.id("input-firstname"));
		
		userid.sendKeys("Monika");
		
		driver.navigate().refresh();
		
		WebElement userid1 = driver.findElement(By.id("input-firstname"));

		
		userid1.sendKeys("ok");
		
		
		
		
		

}
}
