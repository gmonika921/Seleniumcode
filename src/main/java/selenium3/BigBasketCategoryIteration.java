package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketCategoryIteration {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://groceries.asda.com/");
		
		Thread.sleep(2000);
		
		WebElement maincat = driver.findElement(By.xpath("(//span[@class = 'navigation-menu__text'])[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(maincat).click().build().perform();
		
		Thread.sleep(2000);
		
		
		List<WebElement> Level1list = driver.findElements(By.xpath("//div[@class = 'h-nav']//ul/li"));
		
		for (WebElement e1 : Level1list) {
			
			act.moveToElement(e1).build().perform();
			System.out.println(e1.getText());
			
			Thread.sleep(1000);

			List<WebElement> Level2list = driver.findElements(By.xpath("(//div[@class = 'h-nav']//ul)[2]/li"));
			
			Thread.sleep(1000);

			for (WebElement e2 : Level2list) {
			
			act.moveToElement(e2).build().perform();
			System.out.println(e2.getText());
			
			Thread.sleep(1000);

			
			List<WebElement> Level3list = driver.findElements(By.xpath("(//div[@class = 'h-nav']//ul)[3]/li"));
			
			Thread.sleep(1000);

			
					for (WebElement e3 : Level3list) {
						
						act.moveToElement(e3).build().perform();
						System.out.println(e3.getText());
		}
		     
		
		
		
		
		
		}		
		
}
}
}
