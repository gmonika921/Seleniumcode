package seleniumclass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Print the 

public class MultipleElements {

	static WebDriver driver;

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	 driver = new ChromeDriver();
	
	driver.get("https://www.amazon.com");
	
	List<WebElement> linklist = driver.findElements(By.tagName("a"));
	
	System.out.println("Total links :" +linklist.size());
	
//	for(int i = 0; i<= linklist.size()-1; i++) {
//		String text = linklist.get(i).getText();
//		String hrefval = linklist.get(i).getAttribute("href");
//		if (!text.isEmpty()){
//		System.out.println(text +":" +hrefval);
//	}
//	}
//	
	
//	for each loop
	
//	for (WebElement e: linklist) {
//		String text = e.getText();
//		String hrefval = e.getAttribute("href");
//		if (!text.isEmpty()) {
//		System.out.println(text +":" +hrefval);
//		}
//	}
	
//	Using streams
	
//	linklist.stream().forEach(ele-> System.out.println(ele.getText()));
	
//	linklist.stream()
//		.filter(e->!e.getText().isEmpty())
//			.forEach(e -> System.out.println(e.getText()));
//	
	linklist.stream().filter(e->!e.getText().isEmpty()).forEach(e-> e.getText());

	
	linklist
	.parallelStream()
	.filter(e->!e.getText().isEmpty())
		.forEach(e -> System.out.println(e.getText()));

	driver.close();
	
}
	
}
