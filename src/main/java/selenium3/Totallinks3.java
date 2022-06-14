package selenium3;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import seleniumclass1.Rightpanellinklist;

public class Totallinks3 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		List<WebElement>Totallinks = driver.findElements(By.tagName("a"));
		
		System.out.println(Totallinks.size());
		
//		for (int i =0; i<Totallinks.size(); i++) {
//			String text = Totallinks.get(i).getText();
//			if(!text.isEmpty()) {
//			String href = Totallinks.get(i).getAttribute("href");
//			System.out.println(text +":" +href );
//			System.out.println();
//		}
//		}
		
		for (WebElement e: Totallinks) {
			String text1 = e.getText();
			if(!text1.isEmpty()) {
				String href = e.getAttribute("href");
				System.out.println(text1 +":" +href );
				System.out.println();
		
			}
		}
}
	public static void dogetTotalLinksofElements(By locator, String value) {
		List<WebElement>Totallinks = driver.findElements(By.tagName("a"));
		
		System.out.println(Totallinks.size());
		for (int i =0; i<Totallinks.size(); i++) {
			String text = Totallinks.get(i).getText();
			if(!text.isEmpty()) {
			String href = Totallinks.get(i).getAttribute("value");
			System.out.println(text +":" +value );
			System.out.println();
		}
		}
		
		
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}
}
