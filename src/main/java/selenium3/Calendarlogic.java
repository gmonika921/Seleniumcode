package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendarlogic {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
//		selectFutureDate("July 2023", "3");
		selectBackDate("February 2020", "29");
		
		
		
		
	}		

	
	public static void selectFutureDate(String expMonthYear , String dateNum) {
		
		if(expMonthYear.contains("February") && Integer.parseInt(dateNum)>29) {
			System.out.println("Please enter the right day/date :" +dateNum);
			return;
		}
		
		if(Integer.parseInt(dateNum)>31) {
			System.out.println("Please pass the right day/date :" +dateNum);
			return;
		}
		

		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		
		System.out.println(actMonthYear);
		
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[text() = 'Next']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);
		
	}
		selectDate(dateNum);
		
	}
	
	public static void selectBackDate(String expMonthYear , String dateNum) {
		
		if(expMonthYear.contains("February") && Integer.parseInt(dateNum)>29) {
			System.out.println("Please enter the right day/date :" +dateNum);
			return;
		}
		
		if(Integer.parseInt(dateNum)>31) {
			System.out.println("Please pass the right day/date :" +dateNum);
			return;
		}
		

		
		String actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		
		System.out.println(actMonthYear);
		
		while(!actMonthYear.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[text() = 'Prev']")).click();
			actMonthYear = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
			System.out.println(actMonthYear);
		
	}
		selectDate(dateNum);
		
	}

	
	public static void selectDate(String dateNum) {
	
	driver.findElement(By.xpath("//a[text() = '"+dateNum+"']")).click();
	}
}

