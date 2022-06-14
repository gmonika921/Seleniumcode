package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totalimages {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	 driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	
//	List<WebElement> totalimages = driver.findElements(By.tagName("img"));
//	
//	System.out.println("Total images :" +totalimages.size());
	
//	for(int i = 0; i<totalimages.size(); i++) {
//		String im = totalimages.get(i).getText();
//		
//		String src = totalimages.get(i).getAttribute("src");
//		
//		String alt = totalimages.get(i).getAttribute("alt");
//		
//		System.out.println(im +":" +src +":" +alt);
//		
//	}
	
//	for each loop
	
//	for (WebElement e: totalimages) {
//		String src = e.getAttribute("src");
//		String alt = e.getAttribute("alt");
//		String htval = e.getAttribute("height");
//		
//		System.out.println(src);
//		System.out.println(alt);
//		System.out.println(htval);
//		
//		
//	}
//	
	By imageslist = By.tagName("img");
	By linklist = By.tagName("a");
//	int ll = getElements(linklist).size();
//	int ima = getElements(imageslist).size();
	int ll = getElementscount(linklist);
	int ima = getElementscount(imageslist);
	System.out.println("Total link list :" +ll);
	System.out.println("Total images list :" +ima);
	
	driver.close();
	
	
	}
	
	public static int getElementscount(By locator) {
		return getElements(locator).size();
		
	}
		
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
		
	
	
	


}
}
