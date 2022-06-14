package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandlesWithoutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_submitForm_Country");
		
		List<WebElement> countryoptions
		= driver.findElements(By.xpath("//select[@id = 'Form_submitForm_Country']/option"));
		
		System.out.println(countryoptions.size());
		
		for (int i = 0; i< countryoptions.size() ; i++) {
			String text = countryoptions.get(i).getText();
			System.out.println(text);
			
			if(text.contains("India")) {
				countryoptions.get(i).click();
				break;
			}
			
	}
		
		}
	
	public static void selectValuesfromDropDown(By locator, String value) {
		List<WebElement> countryoptions = driver.findElements(locator);
		System.out.println(countryoptions.size());
		for (int i = 0; i< countryoptions.size() ; i++) {
			String text = countryoptions.get(i).getText();
			System.out.println(text);
			
			if(text.contains(value)) {
				countryoptions.get(i).click();
				break;
			}
			
	}
		
		

	
		
	}

	}


