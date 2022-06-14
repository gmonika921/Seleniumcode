package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testtestnoon {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.noon.com/uae-en/");

		while (true) {

			List<WebElement> productlist = driver.findElements(By.xpath("((//div[@class = 'swiper-wrapper'])[3])/div//img"));

			if (productlist.size() > 0) {

				ArrayList<String> Productl = new ArrayList<String>();

				for (WebElement e : productlist) {
					String productname = e.getAttribute("alt");
					Productl.add(productname);
					System.out.println(Productl);

				}

			}

			else {
				clickingfunc();
			}

		}
	}

//			if(driver.findElements(By.linkText("Luggage")).size()>0) {
//				getproductlist();
//			}
//				else {
//				clickingfunc();	
//			}
//			
//
//			
//		}
//		
//		
//	}

	public static void clickingfunc() throws InterruptedException {
		while (true) {
			Thread.sleep(2000);

			WebElement next = driver.findElement(By.cssSelector("div.swiper-button-next.custom-navigation"));
			System.out.println("next");

			if (next.getAttribute("class").contains("disabled")) {
				System.out.println("pagination is over....element not found");

			}

			next.click();
		}
	}

	public static void getproductlist() {
		List<WebElement> productlist = driver
				.findElements(By.xpath("//div[@class = 'swiper-button-next custom-navigation']"));

		for (WebElement e : productlist) {
			String elelist = e.getText();

			System.out.println(elelist);
		}
	}

}
