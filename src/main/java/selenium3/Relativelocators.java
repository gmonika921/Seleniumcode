package selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;

public class Relativelocators {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.aqi.in/dashboard/canada");

//		WebElement ele = driver.findElement(By.linkText("Montreal, Canada"));
//
//		String Righttext = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
//
//		System.out.println("The right side of text is :" + Righttext);
//
//		String lefttext = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
//
//		System.out.println("The left side of text is :" + lefttext);
//
//		String Abovetext = driver.findElement(with(By.tagName("a")).above(ele)).getText();
//
//		System.out.println("The above side of text is :" + Abovetext);
//
//		String nearcity = driver.findElement(with(By.tagName("a")).near(ele)).getText();
//
//		System.out.println("The nearcity is :" + nearcity);
//
//		String Belowtext = driver.findElement(with(By.tagName("a")).below(ele)).getText();
//
//		System.out.println("The below side of text is :" + Belowtext);

		WebElement city = driver.findElement(By.linkText("Quebec"));

		List<WebElement> Rightsideelements = driver.findElements(with(By.tagName("td")).toRightOf(city));
		
//		By.xpath("//a[text() = 'Quebec']//ancestor::tr") - The xpath for entire row
//        By.tagName("tr")-> Getting an empty list

		System.out.println("The size is :" + Rightsideelements);

		for (WebElement e : Rightsideelements) {
			String Scorecardlist = e.getText();

			System.out.println("All right side list is :" + Scorecardlist);
		}

		driver.close();

	}

}
