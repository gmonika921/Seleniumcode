package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class Paginationlogic {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		while (true) {
			if (driver.findElements(By.xpath("//td[text() = 'Hong Kong']")).size() > 0) {
//				Selectcity("Hong Kong");
				SelectcityRelativeLocator("Hong Kong");
				break;
			}

			else {
//					Pagination logic
				WebElement next = driver.findElement(By.linkText("Next"));

				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over.... Element not found");
				}

				next.click();
			}

		}

	}

	public static void Selectcity(String cityname) {
		String checkbox = "//td[text() = '"+cityname +"']//preceding-sibling::td/input[@type = 'checkbox']";
		driver.findElement(By.xpath(checkbox)).click();
	}
	
	public static void SelectcityRelativeLocator(String cityname) {
		
		WebElement checkboxRel = driver.findElement(By.xpath("//td[text() = '"+cityname +"']"));
		
		driver.findElement(with(By.xpath("//input[@type = 'checkbox']")).toLeftOf(checkboxRel)).click();
		
		
		
	}

}
