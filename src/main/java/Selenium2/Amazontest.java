package Selenium2;

public class Amazontest {

	public static void main(String[] args) {

		BrowserUtil rutil = new BrowserUtil();
		
		rutil.initialise("chrome");
		
		rutil.navigateurl("https://www.google.com");
		
		String title = rutil.getPageTitle();
		
		System.out.println(title);
	}

}
