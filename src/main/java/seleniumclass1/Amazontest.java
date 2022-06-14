package seleniumclass1;

public class Amazontest {

	public static void main(String[] args) {
		
		
		BrowserUtil butil = new BrowserUtil();
		
		butil.init_driver("chrome");
		
		butil.navigate("https://www.google.com");
		
//		butil.navigate("https://www.facebook.com");
		
		String title = butil.getPageTitle();
		
	System.out.println(title);
		
	System.out.println(butil.getPageURL().contains("amazon"));
		
    System.out.println(butil.getPageSource().contains("facebook"));
		
	butil.closeBrowser();
		
	butil.quitBrowser();
		
		
		
		
		

	}

}
