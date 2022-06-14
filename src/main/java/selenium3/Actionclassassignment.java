package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionclassassignment {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		
		doProductCategorySearchL4("Beauty & Hygiene", "Skin Care", "Eye Care", "Nivea");
		
//		WebElement MainCategory = driver.findElement(By.xpath("//a[@qa = 'categoryDD' and @class ='dropdown-toggle meganav-shop' ]"));
//		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(MainCategory).perform();
//		
//		Thread.sleep(1500);
//		
//		act.moveToElement(driver.findElement(By.linkText("Fruits & Vegetables"))).build().perform();
//		
//		Thread.sleep(5000);
//		
//		act.moveToElement(driver.findElement(By.linkText("Fresh Fruits"))).build().perform();
//		
//		Thread.sleep(1500);
//		
//		act.moveToElement(driver.findElement(By.linkText("Seasonal Fruits"))).perform();
//		
//		Thread.sleep(1500);
//		
//		act.moveToElement(driver.findElement(By.linkText("Fruits"))).click().build().perform();

	
	}
	
	public static void doProductCategorySearchL4(String L1, String L2, String L3, String L4) throws InterruptedException {
		
		WebElement MainCategory = driver.findElement(By.xpath("//a[@qa = 'categoryDD' and @class ='dropdown-toggle meganav-shop' ]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(MainCategory).perform();
		
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(L1))).build().perform();
		
		Thread.sleep(5000);
		
		act.moveToElement(driver.findElement(By.linkText(L2))).perform();
		
		Thread.sleep(5000);
		
		act.moveToElement(driver.findElement(By.linkText(L3))).perform();
		
		Thread.sleep(1500);
		
		act.moveToElement(driver.findElement(By.linkText(L4))).click().build().perform();
		
	}

}
