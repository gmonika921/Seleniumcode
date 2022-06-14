package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentCricinfo {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/capricorn-women-s-tri-series-2022-1310881/namibia-women-vs-zimbabwe-women-final-1310896/full-scorecard");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@title = 'Sune Wittmann']//span[contains(text(), 'Sune Wittmann')]")).click();
		
//		xpath till parent = (//a[@title = 'Sune Wittmann']//span[contains(text(), 'Sune Wittmann')]//parent::span)[position ()=1]
		
		
		

	}
	
	
//	Wicketkeepername
//	Scorecards

}
