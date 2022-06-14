package selenium3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WaitForTitleandUrl {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		driver.findElement(By.linkText("CONTACT SALES")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		wait.until(ExpectedConditions.urlContains("/contact-sales/"));
		wait.until(ExpectedConditions.urlToBe("https://www.orangehrm.com/contact-sales/"));

//		if (wait.until(ExpectedConditions.titleContains("Contact"))) {
//
//			System.out.println(driver.getTitle());
//
//		}
//
//		driver.close();
//
	}

	public static String waitForTitleContains(String titleFraction, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.titleContains(titleFraction))) {

			return driver.getTitle();

		}
		return null;
	}

	public static String waitForTitleValue(String titleValue, int timeout) {

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

			if (wait.until(ExpectedConditions.titleIs(titleValue))) {

				return driver.getTitle();

			}
			return null;
	}

	public static String waitForUrlContains(String urlFraction, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.urlContains(urlFraction))) {

			return driver.getCurrentUrl();

		}
		return null;
	}

	public static String waitForURLIs(String urlValue, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		if (wait.until(ExpectedConditions.urlToBe(urlValue))) {

			return driver.getCurrentUrl();

		}
		return null;

	}
}
