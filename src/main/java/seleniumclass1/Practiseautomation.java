package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practiseautomation {

	public WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(6000);
		
		driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		
		Thread.sleep(10000);
		
//		List<WebElement> Dresslist = driver.findElements(By.xpath("//div[@class = \"ac_results\"]//li"));
//		
//		driver.findElement(By.xpath("//div[@class = 'ac_results']//li[@class='ac_odd ac_over']")).click();
		
		driver.findElement(By.xpath("//div[@class = 'ac_results']//li[contains(text(), 'Printed Chiffon Dress')]")).click();
		
		
//		System.out.println(Dresslist.size());
//		
//		for (WebElement e : Dresslist) {
//
//			String dl = e.getText();
//
//			System.out.println(dl);
//		}
//
//		for (WebElement e : Dresslist) {
//
//			String dl = e.getText();
//
//			System.out.println(dl);
//
//			if (dl.contains("Summer")) {
//				e.click();
//			}
//		}
//		
//		
//		
//		
//		

}
}
