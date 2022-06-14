package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Totalimages3 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		List<WebElement> Totalimages = driver.findElements(By.tagName("img"));

		System.out.println(Totalimages.size());

		for (int i = 0; i < Totalimages.size(); i++) {
			String imgtext = Totalimages.get(i).getText();
			String src = Totalimages.get(i).getAttribute("src");
			String alt = Totalimages.get(i).getAttribute("alt");

			System.out.println(imgtext + ":" + src + ":" + alt);
		}
		
		Totalimages.stream().filter(e->!e.getText().isEmpty()).forEach(e-> e.getText());

	}
	
	

}
