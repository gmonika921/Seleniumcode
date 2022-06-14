package selenium3;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitConceptImplicit {

	public static void main(String[] args) {

		// Implicit wait - Dynamic wait
		// Global wait
//		

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); Depricated -Sel3.x features

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Sel4.x

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		driver.findElement(By.id("Form_submitForm_FirstName")).sendKeys("Monika");

		driver.findElement(By.id("Form_submitForm_LastName")).sendKeys("Gupta");

		driver.close();

	}

}
