package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class AssignmentRelatLocator {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement ele1 = driver.findElement(By.xpath("//label[text() = 'Subscribe']"));
		
		WebElement ele2 = driver.findElement(By.xpath("//div[@class = 'pull-right']/a"));
		
		Thread.sleep(3000);
		
		driver.findElement(with(By.xpath("//label[@class= 'radio-inline']")).toRightOf(ele1)).click();
		driver.findElement(with(By.tagName("input")).toRightOf(ele2)).click();

		
		

}
	
}
