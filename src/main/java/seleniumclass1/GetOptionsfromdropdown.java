package seleniumclass1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetOptionsfromdropdown {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		Thread.sleep(5000);
		
		By country = By.id("Form_submitForm_Country");
		
//		Select select = new Select(driver.findElement(country));
//		
//		List<WebElement> countryoptions = select.getOptions();
//		
//		System.out.println(countryoptions.size());
//		
//		for (WebElement e : countryoptions) {
//			String text = e.getText();
//			if (text.equals("India")) {
//				e.click();
//				break;
//			}
//
//		}
		
		List<String> st = getSelectDropDowngetElementsaluesList(country);
		
		System.out.println(st);
		
		 printSelectDropDownValues(country);
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

	public static void printSelectDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionlist = select.getOptions();

		for (WebElement e : optionlist) {
			String text = e.getText();
			System.out.println(text);

		}

	}
	
	public static List<String> getSelectDropDowngetElementsaluesList(By locator) {
		
		Select select = new Select(getElement(locator));
		
		List<String> valuelist = new ArrayList<String>();
		List<WebElement> optionlist = select.getOptions();
		
		for (WebElement e : optionlist) {
			String text = e.getText();
			valuelist.add(text);
			
		}
		return valuelist;
	}
		
	
	
	public static int getSelectDropDownValueCount(By locator) {
		return  getElements(locator).size();
	}
	
	public static void selectValuefromSelectDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionlist = select.getOptions();
		
		for (WebElement e : optionlist) {
			String text = e.getText();
			
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
