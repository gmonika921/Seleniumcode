package Selenium2;

public interface Util {
	
	
	String CHROME_BROWSER = "chrome";
	String SAFARI_BROWSER = "safari";
	String FIREFOX_BROWSER = "firefox";
	
	public void navigateurl(String url);
	
	public String getPageTitle();
	
	public String getPageURL();
	
	public String getPageSource();
	
	public void close();
	
	public void quit();
	

}
