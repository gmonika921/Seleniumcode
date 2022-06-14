package seleniumclass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2registerbylo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		BrowserUtil butil = new BrowserUtil();
		
		WebDriver driver = butil.init_driver("chrome");
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		By  f_name = By.id("input-firstname");
				
		By l_name = By.id("input-lastname");
		
		By email = By.id("input-email");
		
		By Phonenum  = By.id("input-telephone");
		
		By pwd = By.id("input-password");
		
		By con_pwd = By.id("input-confirm");
		
		Elementutil eutil = new Elementutil(driver);
		
		eutil.dosendkeys(f_name, "Monika");
		eutil.dosendkeys(l_name, "gupta");
		eutil.dosendkeys(email, "monika@gmail.com");
		eutil.dosendkeys(Phonenum, "989765849");
		eutil.dosendkeys(pwd, "test@123");
		eutil.dosendkeys(con_pwd, "test@123");
	}

}
