package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentnoon {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");
		
		while(true) {
			
			List<WebElement> productlist = driver.findElements(By.xpath("((//div[@class = 'swiper-wrapper'])[3])/div"));
			
			if(productlist.size()>0) {
				
				ArrayList<String> Productl = new ArrayList<String>();
				
				for (WebElement e : productlist) {
					String productname = e.getText();
					Productl.add(productname);
					System.out.println(Productl);
					
				}	
				
		}
			
			else {
				WebElement next = driver.findElement(By.xpath("//div[@class = 'swiper-button-next custom-navigation']"));
				if(next.getAttribute("class").contains("disabled")){
					System.out.println("Carousel is over....");
					
				}
				next.click();
			}
		}


}
	
	
	
	
	
	
	
	
	
	
}
