package selenium3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptAlertPopHandle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Alert alert =driver.switchTo().alert();
		
		String text = alert.getText();
		
		System.out.println(text);
		
		alert.accept();
//		alert.dismiss();
		
		String login = "login1";
		String pwd = "password";
		
		ElementUtil el3 = new ElementUtil(driver);
		
		el3.doSendKeys(el3.getBy("id", login), "monika123");
		el3.doSendKeys(el3.getBy("id", pwd), "test123");
		
		
		
		

}
}
