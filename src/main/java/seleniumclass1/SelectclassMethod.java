package seleniumclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectclassMethod {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_submitForm_Country");
		
		Select select = new Select(driver.findElement(country));
		
//		select.deselectAll();
//		select.selectByVisibleText(null);
//		select.selectByValue(null);
		
		System.out.println(select.isMultiple());
		
		select.getAllSelectedOptions();
		
		
		
		

}
	
}
