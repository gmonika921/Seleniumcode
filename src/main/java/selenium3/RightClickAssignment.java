package selenium3;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickAssignment {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement Rightclick = driver.findElement(By.xpath("//span[@class = 'context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(Rightclick).perform();
		
		By rightlist = By.xpath("//ul[@class = 'context-menu-list context-menu-root']/li[contains (@class,'context-menu-icon')]");
		
//		List<WebElement> rightlist = 
//				driver.findElements(By.xpath("//ul[@class = 'context-menu-list context-menu-root']/li[contains (@class,'context-menu-icon')]"));
//		
//		for (WebElement e : rightlist) {
//			
//			String text = e.getText();
//			System.out.println(text);
//			Thread.sleep(2000);
//			if(text.equals("Edit")) {
//				e.click();
//				alert1();
//			}
//		}
//
//	}
		
		
    ok(rightlist, "Edit");
    
    act.contextClick(Rightclick).perform();
    
    Thread.sleep(1000);
    
    ok(rightlist, "Cut");
    act.contextClick(Rightclick).perform();
    Thread.sleep(1000);
    
    ok(rightlist, "Copy");
    act.contextClick(Rightclick).perform();
    Thread.sleep(1000);
    
    ok(rightlist, "Paste");
    act.contextClick(Rightclick).perform();
    Thread.sleep(1000);
    
    ok(rightlist, "Delete");
    act.contextClick(Rightclick).perform();
    Thread.sleep(1000);
    
    ok(rightlist, "Quit");
    act.contextClick(Rightclick).perform();
     
		
	}
		
	public static void ok (By locator , String value) {
		
		List<WebElement> elelist = driver.findElements(locator);
		for (WebElement e : elelist) {
			String text = e.getText();
//			System.out.println(text);
			if(text.equals(value)) {
				e.click();
				alert1();
				break;
			}
		}
		
			
	}
	
	
	public static void alert1 () {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	
		
		
	}

}
