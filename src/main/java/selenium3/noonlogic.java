package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;

import io.github.bonigarcia.wdm.WebDriverManager;

public class noonlogic {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");
		
		Thread.sleep(3000);
		
		
		String text = 
				driver.findElement(By.xpath("((((//div[@class = 'swiper-wrapper'])[3])/div)//img)[4]")).getAttribute("alt");
		
		System.out.println(text);
		
		driver.close();
		

}
}
