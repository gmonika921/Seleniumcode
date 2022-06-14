package seleniumclass1;

public interface Util {
	
	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String SAFARI_BROWSER = "safari";
	
	
	
	public void navigate(String url);
	
	public String getPageTitle();
	
	public String getPageURL();
	
	public String getPageSource();
	
	public void closeBrowser();
	
	public void quitBrowser();
	
	

}
