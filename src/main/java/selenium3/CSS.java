package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSS {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		ID = #id
		
		By fname = By.cssSelector("#input-firstname");
		
		driver.findElement(fname).sendKeys("Monika");
		
//		class = .classname
		
		By lname = By.cssSelector("input.form-control#input-lastname");
		
		driver.findElement(lname).sendKeys("Gupta");
		
		By email_id = By.cssSelector("input[type = 'email']");
		
		driver.findElement(email_id).sendKeys("gmonika92@gmail.com");
		
		By pwd = By.cssSelector("input[type = 'tel'][id = 'input-telephone']");
		
		driver.findElement(pwd).sendKeys("test123");
		
		
		
		
		
		

	}

}
