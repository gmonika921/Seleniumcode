package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectdropdownvalueswithoutselectclass {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		List<WebElement> countryoption = 
				driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
		
		System.out.println(countryoption.size());
		
		for (int i =-0; i <countryoption.size(); i++) {
			String text = countryoption.get(i).getText();
			System.out.println(text);
		}
	}
		
		
		public static void selectCountryFromDropDown(By locator, String value) {
			List<WebElement> optionlist= driver.findElements(locator);
			
			System.out.println(optionlist.size());
			
			for (int i =-0; i <optionlist.size(); i++) {
				String text = optionlist.get(i).getText();
				System.out.println(text);
				
				if(text.contains(value)) {
					optionlist.get(i).click();
					break;
				}
			}
			
		}
		
		


}
