package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCartTestApp {
	WebDriver driver;
	
	@BeforeTest
	
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
	}
	
	@Test
	
	public void pageTitleTest() {
		String Title = driver.getTitle();
		System.out.println("Page Title is :" +Title);
		Assert.assertEquals(Title, "Account Login");
		
	}
	
	@Test
	
	public void pageURLTest() {
		String URL = driver.getCurrentUrl();
		System.out.println("Current URL is :" +URL);
		Assert.assertTrue(URL.contains("account"));
	}
	
	@Test
	public void textfieldTest() {
		boolean displayed = driver.findElement(By.xpath("(//input[@type ='text'])[1]")).isDisplayed();
		System.out.println(displayed);
		Assert.assertEquals(displayed, true);
	}
	
	@Test
	public void cartButtonTest() {
		boolean displayed = driver.findElement(By.xpath("(//button[@type ='button'])[5]")).isDisplayed();
		System.out.println(displayed);
		Assert.assertEquals(displayed, true);
	}
	
	@Test
	
	public void header1Test() {
		String header1 = driver.findElement(By.linkText("Your Store")).getText();
		System.out.println("Page hearder1 is :" +header1);
		Assert.assertEquals(header1, "Your Store");
	}
	
	@Test
	public void header2Test() {
		String header2 = driver.findElement(By.xpath("(//div[@class = 'well'])[1]")).getText();
		System.out.println("Page hearder2 is :" +header2);
		Assert.assertEquals(header2, "New Customer");
	}
	
	@Test
	public void header3Test() {
		String header3 = driver.findElement(By.xpath("(//div[@class = 'well'])[2]")).getText();
		System.out.println("Page hearder3 is :" +header3);
		Assert.assertEquals(header3, "Returning Customer");
	}
	
	@Test
	
	public void registerTest() {
		boolean Regdisplayed = driver.findElement(By.linkText("Register")).isDisplayed();
		System.out.println(Regdisplayed);
		Assert.assertEquals(Regdisplayed, true);
	}
	
	@Test
	
	public void loginLinkTest() {
		boolean logdisplayed = driver.findElement(By.linkText("Login")).isDisplayed();
		System.out.println(logdisplayed);
		Assert.assertEquals(logdisplayed, true);
	}
	
	@Test
	
	public void forpwdLinkTest() {
		boolean forpwddisplayed = driver.findElement(By.linkText("Forgotten Password")).isDisplayed();
		System.out.println(forpwddisplayed);
		Assert.assertEquals(forpwddisplayed, true);
	}
	
	@Test
	
	public void accountLinkTest() {
		boolean Accdisplayed = driver.findElement(By.linkText("My Account")).isDisplayed();
		System.out.println(Accdisplayed);
		Assert.assertEquals(Accdisplayed, true);
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		
	}

}
