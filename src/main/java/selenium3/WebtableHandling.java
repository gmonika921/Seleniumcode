package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement Joe = 
				driver.findElement(By.xpath("//a[contains(text(),'Joe.Root')]/../../td/input[@id = 'ohrmList_chkSelectRecord_21']"));
		
		Joe.click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Joe.Root')]/parent::td/preceding-sibling::td/input"));
		
			

	}
	
	public static void Selectuser (String name) {
		WebElement xpath = 
				driver.findElement(By.xpath("//a[contains(text(),'"+name+"')]/parent::td/preceding-sibling::td/input"));
		
		xpath.click();
	}
	
	public static List<String> getUserdata(String name) {
		List<String> collist = new ArrayList<String>();
		
		List <WebElement> Colele = 
				driver.findElements(By.xpath("//a[contains(text(),'"+name+"')]/parent::td/following-sibling::td"));
		
		for (WebElement e : Colele) {
			String text = e.getText();
			
			collist.add(text);
		}
		
		return collist;
			
	}
}
