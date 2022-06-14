package selenium3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignmentframes {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	
	driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
	
	driver.findElement(By.xpath("//*[@id=\"imageTemplateContainer\"]/img")).click();
	
	driver.switchTo().frame("frame-one748593425");
	

	
	ElementUtil e3 = new ElementUtil(driver);
	
	By Vehicleyear = By.id("RESULT_TextField-2");
	By Vehiclemake = By.id("RESULT_TextField-3");
	By Vehiclemode = By.id("RESULT_TextField-4");
	By colour = By.id("RESULT_TextField-5");
	By Mileage = By.id("RESULT_TextField-6");
	By VIN = By.id("RESULT_TextField-7");
	By name = By.id("RESULT_TextField-8");
	By address1 = By.id("RESULT_TextField-9");
	By address2 = By.id("RESULT_TextField-10");
	By city = By.id("RESULT_TextField-11");
	By state = By.id("RESULT_RadioButton-12");
	By Zip = By.id("RESULT_TextField-13");
	By phone = By.id("RESULT_TextField-14");
	By email = By.id("RESULT_TextField-15");
	By submit = By.id("FSsubmit");
	By warningmsg = By.name("invalid_message");
	
	e3.doSendKeys(Vehicleyear, "2000");
	e3.doSendKeys(Vehiclemake, "BMW");
	e3.doSendKeys(Vehiclemode, "autostart");
	e3.doSendKeys(colour, "yellow");
	e3.doSendKeys(Mileage, "100");
	e3.doSendKeys(VIN, "758475");
	e3.doSendKeys(name, "Monika");
	e3.doSendKeys(address1, "40 Didsbury lane");
	e3.doSendKeys(address2, "Palatine road");
	e3.doSendKeys(city, "Manchester");
	
	Thread.sleep(3000);
	
	WebElement states = e3.getElement(state);
	
	Select select = new Select(states);
	
	select.selectByIndex(9);
	
//	List<WebElement> states = e3.getElements(state); // Why this not worked?
//	
//	for (WebElement e: states) {
//		if(states.contains("Nevada")) {
//			e.click();
//		}
//		
//	}
	
//	e3.clickonElementfromSelection(state, "New Jersey"); // Why this not worked?
	e3.doSendKeys(Zip, "3490");
	e3.doSendKeys(phone, "908734748");
	e3.doSendKeys(email, "monika123@gmail.com");
	e3.doclick(submit);
//	String mesg = driver.findElement(warningmsg).getText();
//	
//	System.out.println(mesg);
	
	driver.switchTo().parentFrame();
	
	driver.switchTo().defaultContent();
	
	
	driver.findElement(By.linkText("Get this form")).click();

	}

}
