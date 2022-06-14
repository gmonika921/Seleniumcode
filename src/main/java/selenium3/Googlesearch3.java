package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearch3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(4000);
		
		driver.findElement(By.name("q")).sendKeys("Bny mellon");
		
		Thread.sleep(2000);
		
		
		
		List<WebElement> Googlesearchlist = 
				driver.findElements(By.xpath("//ul[@role = 'listbox']//div[@class = 'wM6W7d']//span"));
		
		int numberofsearch = Googlesearchlist.size();
		System.out.println("total number of suggestions :" +numberofsearch);
		
		for (int i =0; i<Googlesearchlist.size(); i++) {
			String text = Googlesearchlist.get(i).getText();
			System.out.println(text);
			
		}
		
		for (int i =0; i<Googlesearchlist.size(); i++) {
			String text = Googlesearchlist.get(i).getText();
			System.out.println(text);
			
			if(text.contains("jobs")) {
				Googlesearchlist.get(i).click();
				System.out.println(Googlesearchlist.get(i));
				
			}
			
		}
		
		
	}
		


		
		
		

	

}
