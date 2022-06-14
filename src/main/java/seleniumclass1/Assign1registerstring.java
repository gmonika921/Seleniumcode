package seleniumclass1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign1registerstring {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		BrowserUtil butil = new BrowserUtil();
		
		WebDriver driver = butil.init_driver("chrome");
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		String f_name = "input-firstname";
				
		String l_name = "input-lastname";
		
		String email = "input-email";
		
		String Phonenum  = "input-telephone";
		
		String pwd = "input-password";
		
		String con_pwd = "input-confirm";
		
		String btn = "//*[@id=\"content\"]/form/div/div/input[1]";
		
		String cont = "//*[@id=\"content\"]/form/div/div/input[2]";
		
		Elementutil eutil = new Elementutil(driver);
	
		eutil.dosendkeys(eutil.getBy("id", f_name), "monika");
		eutil.dosendkeys(eutil.getBy("id", l_name), "gupta");
		eutil.dosendkeys(eutil.getBy("id", pwd), "test123");
		eutil.dosendkeys(eutil.getBy("id", email), "monika@gmail.com");
		eutil.dosendkeys(eutil.getBy("id", Phonenum), "908656679");
		eutil.dosendkeys(eutil.getBy("id", pwd), "test@122");
		eutil.dosendkeys(eutil.getBy("id",con_pwd), "test@122");
		eutil.doclick(eutil.getBy("xpath", btn));
		eutil.doclick(eutil.getBy("xpath", cont));
		
	
		
		
		
		
		
		

	}

}
