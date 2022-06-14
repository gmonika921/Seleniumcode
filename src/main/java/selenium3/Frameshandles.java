package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frameshandles {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://londonfreelance.org/courses/frames/index.html");
		
//		driver.switchTo().frame(2);
		
//		driver.switchTo().frame("main");
		
		String title2 =  driver.switchTo().frame(driver.findElement(By.name("navbar"))).getTitle();
		 
		String text2 = driver.findElement(By.xpath("/html/body/h3")).getText();
		
//		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		
//		WebElement title = driver.findElement(By.xpath("/html/body/h2"));
		
//		String text = title.getText();
		
		System.out.println(title2 +":" +text2);
		
		driver.close();
		
		
		
		

	}

}
