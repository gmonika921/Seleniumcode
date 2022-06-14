package selenium3;

public class Amazontest3 {

	public static void main(String[] args) {
		
		Browserutil3 bru = new Browserutil3();
		
		bru.initialiseBrowser("chrome");
		
		bru.navigateUrl("https://www.amazon.co.uk/");
		
		System.out.println(bru.getPageTitle());
		
		System.out.println(bru.getPageSource().contains("amazon"));
		
		System.out.println(bru.getPageUrl());
		
		bru.closeBrowser();
		

	}

}
