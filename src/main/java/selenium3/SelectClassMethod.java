package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassMethod {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_submitForm_Country");
		
		WebElement country_ele = driver.findElement(country);
		
		Select select = new Select(country_ele);
		select.deselectAll();
		select.deselectByIndex(4);
		select.deselectByVisibleText(null);
		
		select.isMultiple();
		
		

}
}
