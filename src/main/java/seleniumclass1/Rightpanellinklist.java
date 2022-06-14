package seleniumclass1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rightpanellinklist {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		Thread.sleep(4000);
		
		By Rightpanel = By.xpath("//aside[@id = 'column-right']//a");
		
		
//		printAllElementsText(Rightpanel);
		
//		Thread.sleep(2000);
		
		int num = getElementsListcount(Rightpanel);
		
		System.out.println(num);
		
//		Thread.sleep(4000);
		
  List<String> rg = getElementsTextList(Rightpanel);
  
  System.out.println(rg);
		
		
		
		
	}
	
	public static int getElementsListcount(By locator) {
		return driver.findElements(locator).size();
		
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<String> eleTextlist = new ArrayList<String>();
		
		List<WebElement> elelist = driver.findElements(locator);
		
		for (WebElement e: elelist) {
			
			String Text = e.getText();
			
			eleTextlist.add(Text);	
		}
		
		return eleTextlist;
		
	}
	
	public static void printAllElementsText(By locator) {
		
		List<WebElement> elelist = driver.findElements(locator);
		
		System.out.println("Total number of links :" +elelist.size());
		
		for(WebElement e: elelist) {
			String list = e.getText();
			System.out.println(list);
		}
	}

}
	

