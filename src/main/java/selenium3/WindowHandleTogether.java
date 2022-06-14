package selenium3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTogether {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // Parent Window
		String parentWindowId = driver.getWindowHandle();
		
		By Linkedin = By.xpath("//img[@alt = 'LinkedIn OrangeHRM group']");
		
//		By facebook = By.xpath("//img[@alt = 'OrangeHRM on Facebook']");
//		
//		By twitter = By.xpath("//img[@alt = 'OrangeHRM on twitter']");
//		
//		By youtube = By.xpath("//img[@alt = 'OrangeHRM on youtube']");
				
		
//		driver.findElement(By.xpath("//img[@alt = 'LinkedIn OrangeHRM group']")).click();
//		driver.findElement(By.xpath("//img[@alt = 'OrangeHRM on Facebook']")).click();
//		driver.findElement(By.xpath("//img[@alt = 'OrangeHRM on twitter']")).click();
//		driver.findElement(By.xpath("//img[@alt = 'OrangeHRM on youtube']")).click();
//		
//		Set<String> handles = driver.getWindowHandles();
//		
//		Iterator<String> it = handles.iterator();
//		
//		String PW = it.next();
//		
//		System.out.println(PW);
//		
//		String Youtube = it.next();
//		
//		System.out.println("Youtube :" +Youtube);
//		
//		String TW = it.next();
//		
//		System.out.println("Facebook :" +TW);
//		
//		String FB = it.next();
//		
//		System.out.println("Twitter :" +FB);
//		
//		String Linkedin = it.next();
//		
//		System.out.println("Linkedin :" +Linkedin);
//		
//		System.out.println("===============Getting title========================");
//		
//		driver.switchTo().window(Youtube);
//		
//		System.out.println("Youtube ==" +driver.getTitle());
//		
//		driver.close();
//		
//		driver.switchTo().window(TW);
//		
//		System.out.println("TW ==" +driver.getTitle());
//		
//		driver.close();
//		
//		driver.switchTo().window(FB);
//		
//		System.out.println("FB =="+ driver.getTitle());
//		
//		driver.close();
//		
//		driver.switchTo().window(Linkedin);
//		
//		System.out.println("Linkedin ==" +driver.getTitle());
//		
//		driver.close();
//		
//		System.out.println("==============Switching to parent window==================");
//		
//		driver.switchTo().window(PW);
//		
//		System.out.println(driver.getTitle());
//		
//		driver.close();
		
//		WindowHandlesTogether(Linkedin);
//		WindowHandlesTogether(youtube);
//		WindowHandlesTogether(twitter);
//		WindowHandlesTogether(facebook);
			

	}
	
	public static void WindowHandlesTogether(By locator, String parentWindowId) {
		driver.findElement(locator).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			if (!windowId.equals(parentWindowId))
			System.out.println(driver.getTitle());
			driver.close();
		}
		
	
	}

}
