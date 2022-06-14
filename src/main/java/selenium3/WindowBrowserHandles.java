package selenium3;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowBrowserHandles {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt = 'LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String ParentWindowId = it.next();
		
		System.out.println(ParentWindowId);
		
		String ChildWindowId = it.next();
		
		System.out.println(ChildWindowId);
		
		driver.switchTo().window(ChildWindowId);
		
		System.out.println("Child Window id :"  +driver.getTitle());
		
		driver.close();	
		
		driver.switchTo().window(ParentWindowId);
		
		System.out.println("Parent Window id :"  +driver.getTitle());
		
		driver.close();	

	}

}
