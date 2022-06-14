package selenium3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleonebyone {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		By Linkedin = By.xpath("//img[@alt = 'LinkedIn OrangeHRM group']");
		
		By youtube = By.xpath("//img[@alt = 'OrangeHRM on youtube']");
		
		By twitter = By.xpath("//img[@alt = 'OrangeHRM on twitter']");
		
		By facebook = By.xpath("//img[@alt = 'OrangeHRM on Facebook']");
				

		switchtowindows(Linkedin);
		switchtowindows(facebook);
		switchtowindows(twitter);
		switchtowindows(youtube);
		
		
//		String parentwindowid = driver.getWindowHandle();
		
//		driver.findElement(By.xpath("//img[@alt = 'LinkedIn OrangeHRM group']")).click();
//		
//		Set<String> handles1 = driver.getWindowHandles();
//		
//		Iterator<String> it1 = handles1.iterator();
//		
//		String Pwid = it1.next();
//		String Cwid = it1.next();
//		
//		driver.switchTo().window(Cwid);
//		
//		System.out.println(driver.getTitle());
//		
//		driver.close();
//		
//		driver.switchTo().window(Pwid);
//		
//		driver.findElement(By.xpath("//img[@alt = 'OrangeHRM on Facebook']")).click();
//		
//		Set<String> handles2 = driver.getWindowHandles();
//		
//		Iterator<String> it2 = handles2.iterator();
//		
//		String Pwid2 = it2.next();
//		String Cwid2 = it2.next();
//		
//		driver.switchTo().window(Cwid2);
//		
//		
	}
	
//	Generic approach
	
	public static void switchtowindows(By locator) {
		
//		String parentwindowid = driver.getWindowHandle();
		
		getElement(locator).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String Pwid = it.next();
		String Cwid = it.next();
		
		driver.switchTo().window(Cwid);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(Pwid);
		
		
		
	}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
	

}
