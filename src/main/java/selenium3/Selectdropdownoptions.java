package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownoptions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		By country = By.id("Form_submitForm_Country");
		
		WebElement country_ele = driver.findElement(country);
		
		Select select = new Select(country_ele);
		
		List<WebElement> countryoptions = select.getOptions();
		
		for (WebElement e : countryoptions) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains("India")) {
				e.click();
				break;
			}
		}
	}
	public static void printSelectDropDownValue(By locator) {
		
		Select select = new Select(driver.findElement(locator));
		
		List<WebElement> Optionlist = select.getOptions();
		
		System.out.println(Optionlist.size());
		
		for (WebElement e : Optionlist) {
			String text = e.getText();
			System.out.println(text);
		}
	}
		
	public static void SelectValueFromDropDown(By locator, String value) {
			
			Select select = new Select(driver.findElement(locator));
			
			List<WebElement> Optionlist = select.getOptions();
			
			System.out.println(Optionlist.size());
			
			for (WebElement e : Optionlist) {
				String text = e.getText();
				System.out.println(text);
				if (text.contains(value)) {
					e.click();
					break;
				}
			}
	}
	
			
	public static int getSelectFromDropDownCount(By locator) {
				
				return driver.findElements(locator).size(); 
		
	}
	
	public static List<String> printSelectDropDownValueList(By locator) {
		
		List<String> ValuesList = new ArrayList<String>();
		
		Select select = new Select(driver.findElement(locator));
		
		List<WebElement> Optionlist = select.getOptions();
		
		System.out.println(Optionlist.size());
		
		for (WebElement e : Optionlist) {
			String text = e.getText();
			ValuesList.add(text);
		}
		
		return ValuesList;
	}
	
	


}

