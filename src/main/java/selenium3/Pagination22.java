package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Pagination22 {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");
		
		Thread.sleep(3000);

		while (true) {
			if (driver.findElements(By.xpath("//img[@alt ='/health-personal-care']")).size() > 0) {
			Selectproduct("health-personal-care");
				break;
				
			
			}

			else {
//					Pagination logic
				WebElement next = driver.findElement(By.xpath("//div[@class = 'swiper-button-next custom-navigation']"));
				if(next.getAttribute("class").contains("disabled")){
					System.out.println("Carousel is over.... element not found");
				
				}

				next.click();
			}
			
			Thread.sleep(3000);

		}
		

	}

	public static void Selectproduct(String product) {
		String productname = "//img[@alt ='/health-personal-care']";
		driver.findElement(By.xpath(productname)).click();
	}
	
	public static void SelectcityRelativeLocator(String cityname) {
		
		WebElement checkboxRel = driver.findElement(By.xpath("//td[text() = '"+cityname +"']"));
		
		driver.findElement(with(By.xpath("//input[@type = 'checkbox']")).toLeftOf(checkboxRel)).click();
		
		
		
	}

}
