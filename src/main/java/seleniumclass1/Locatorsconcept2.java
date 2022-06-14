package seleniumclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locatorsconcept2 {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
//		2. name
		
		By f_name = By.name("firstname");
		By l_name = By.name("lastname");
		
		Elementutil e1util = new Elementutil(driver);
		e1util.dosendkeys(f_name, "Monika");
		e1util.dosendkeys(l_name, "Gupta");
		
//		3. Classname - CSS (Cascade style sheet)
		
		By email = By.className("form-control");
		
		e1util.dosendkeys(email, "monika@yahoo.com");
		
//		4.x-path is an address of a dom (data object model)
		
		By tphone = By.xpath("//*[@id=\"input-telephone\"]");
		
		e1util.dosendkeys(tphone, "9087367898");
		
//		5. By CSS - is a locator not an attribute
		
		By pwd = By.cssSelector("#input-password");
		
		e1util.dosendkeys(pwd, "test@123");
		
		By con_pwd = By.id("input-confirm");
		
		e1util.dosendkeys(con_pwd, "test@123");
		
		By checkbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		
		e1util.doclick(checkbox);
		
		By conti = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		e1util.doclick(conti);
		
		By error = By.xpath("/html/body");
		
		e1util.doGetElementtext(error);
		
		
		
		
		
		
		
		

		
		
	}

}
