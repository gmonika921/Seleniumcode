package selenium3;

public interface Utilinterface3 {
	
	String CHROME_BROWSER = "chrome";
	String SAFARI_BROWSER = "safari";
	String FIREFOX_BROWSER = "firefox";
	
	
	public void navigateUrl(String url);
	
	public String getPageTitle();
	
	public String getPageUrl();
	
	
	public String getPageSource();
	
	public void closeBrowser();
	
	public void quitBrowser();
	
	

}
