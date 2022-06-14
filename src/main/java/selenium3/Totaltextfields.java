package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totaltextfields {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register/");
		
		Thread.sleep(6000);
		
		List<WebElement> Textfields = driver.findElements(By.className("form-control"));
		
		int t = Textfields.size();
		
		System.out.println("Total text fields: " +t);
//		
//		for (WebElement e : Textfields) {
//			String text = e.getText();
//			
//			System.out.println(text);
//		}
//


	}

}
