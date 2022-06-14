package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentWebtablehandling {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/capricorn-women-s-tri-series-2022-1310881/namibia-women-vs-zimbabwe-women-final-1310896/full-scorecard");
		
		Thread.sleep(4000);
		
//		List<WebElement> colele = driver.findElements(By.xpath("(//span[contains(text(), 'Sune Wittmann' )]//parent::a//parent::span//parent::td//parent::tr)//td[@class = 'ds-min-w-max ds-text-right']"));
//		
//		for (WebElement e : colele) {
//			
//			List<String> collist = new ArrayList<String>();
//			String text = e.getText();
////			System.out.println(text);
//			collist.add(text);	
//			System.out.println(collist);
//		}	
		
		System.out.println(getplayerdata("Kayleen Green"));
		System.out.println(getplayerdata("Sylvia Shihepo"));
	}
	
	public static List<String> getplayerdata(String name) {
		
		List<WebElement> colele 
		= driver.findElements(By.xpath("(//span[contains(text(), '"+name+"' )]//parent::a//parent::span//parent::td//parent::tr)//td[@class = 'ds-min-w-max ds-text-right']"));
		
		List<String> collist = new ArrayList<String>();
		
		for (WebElement e : colele) {
			String text = e.getText();
			collist.add(text);	
		}
		return collist;
		
	}
}
