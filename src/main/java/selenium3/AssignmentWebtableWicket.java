package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentWebtableWicket {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/capricorn-women-s-tri-series-2022-1310881/namibia-women-vs-zimbabwe-women-final-1310896/full-scorecard");
		
		Thread.sleep(4000);
//		
//		String text 
//		= driver.findElement(By.xpath("(//td[@class = 'ds-min-w-max']//parent::tr//td)[position()=2]")).getText();
//		
//		System.out.println(text);
		
	
	
	 Wicketname("Jurriene Diergaardt");
	 Wicketname("Wilka Mwatile");
	 Wicketname("Adri van der Merwe");
	 Wicketname("Sylvia Shihepo");
	 
	 driver.close();
	
}
	
 public static void Wicketname (String name) {
	  
	String Wickname = driver.findElement(By.xpath("((//a[@title = '"+name+"']//parent::span//parent::td//parent::tr)/td)[position()=2]")).getText();
	
	System.out.println(Wickname);
	 

	 
 }
}	
