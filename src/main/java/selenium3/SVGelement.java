package selenium3;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGelement {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
		Thread.sleep(5000);
		
		List<WebElement> stateslist 
		= driver.findElements(By.xpath("//*[local-name() = 'svg'  and @id = 'map-svg']//*[name() = 'g' and @id = 'states']//*[name() = 'path']"));

		
		
		System.out.println("The size of states is: " +stateslist.size());
		
		Actions act = new Actions(driver);
		
		for (WebElement e : stateslist) {
		
			act.moveToElement(e).perform();
			
			String name = e.getAttribute("name");
			
			System.out.println(name);
			
			if (name.equals("Ohio")) {
//				e.click();
				act.click().perform();
				
//				Set<String> handles = driver.getWindowHandles();
//				Iterator<String> it = handles.iterator();
//				String Pid = it.next();
//				String Cid = it.next();
//				
//				System.out.println(Pid);
//				System.out.println(Cid);
//				
//				driver.switchTo().window(Cid);
//				
				Thread.sleep(5000);
				
	List <WebElement> Ohiostates = 
	driver.findElements(By.xpath("//*[local-name() = 'svg' and @id = 'map-svg']//*[name() = 'g' and @id = 'states']//*[name() = 'g'  and @class = 'state']"));
	
	System.out.println("The size of OHIO states is: " +Ohiostates.size());

	for (WebElement e1 : Ohiostates ) {
		
		act.moveToElement(e1).perform();
		
		String name1 = e1.getAttribute("name");
		
		System.out.println(name1);
				
			
		}
		

	}
		}

}
	
public static void getStatesname(By locator, String name)	{
	List<WebElement> stateslist = driver.findElements(locator);
	
	System.out.println(stateslist.size());
	
	Actions act = new Actions(driver);
	
	for (WebElement e : stateslist) {
	
		act.moveToElement(e).perform();
		
		String Attrnames = e.getAttribute("name");
		
		System.out.println(Attrnames);
		
		if (Attrnames.equals("name")) {
//			e.click();
			act.click().perform();
			break;
	
}
}
}
}
