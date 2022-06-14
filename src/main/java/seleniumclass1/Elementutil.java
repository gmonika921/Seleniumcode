package seleniumclass1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Elementutil {

	private WebDriver driver;

	public Elementutil(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatorType, String locatorvalue) {

		By locator = null;

		switch (locatorType) {
		case "id":
			locator = By.id(locatorvalue);
			break;

		case "name":
			locator = By.name(locatorvalue);
			break;

		case "classname":
			locator = By.className(locatorvalue);
			break;

		case "xpath":
			locator = By.xpath(locatorvalue);
			break;

		case "css":
			locator = By.cssSelector(locatorvalue);
			break;

		case "linktext":
			locator = By.linkText(locatorvalue);
			break;

		case "partiallinktext":
			locator = By.partialLinkText(locatorvalue);
			break;

		case "tagname":
			locator = By.tagName(locatorvalue);
			break;

		default:
			System.out.println("Please pass the valid locator :" + locator);
			break;
		}

		return locator;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public void dosendkeys(By locator, String value) {
		getElement(locator).sendKeys(value);

	}

	public void doclick(By locator) {
		getElement(locator).click();
	}

	public String doGetElementtext(By locator) {
		return getElement(locator).getText();

	}

	public String getAttribute(By locator, String value) {
		return getElement(locator).getAttribute(value);
	}

	public boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

//	============================================Multiple Elements==================================================

	public void clickonElementfromselection(By locator, String value) {
		List<WebElement> elelist = getElements(locator);

		System.out.println("The total number of footerlink is :" + elelist.size());
		System.out.println();

		for (WebElement e : elelist) {
			String ft = e.getText();
			System.out.println("The name of footer link is :" + ft);
			System.out.println();

			if (ft.contains(value)) {
				e.click();
				break;
			}

		}

	}

	public int getElementsListcount(By locator) {
		return getElements(locator).size();

	}

	public List<String> getElementsTextList(By locator) {
		List<String> eleTextlist = new ArrayList<String>();

		List<WebElement> elelist = getElements(locator);

		for (WebElement e : elelist) {

			String Text = e.getText();

			eleTextlist.add(Text);
		}

		return eleTextlist;

	}

	public void printAllElementsText(By locator) {

		List<WebElement> elelist = getElements(locator);

		System.out.println("Total number of links :" + elelist.size());

		for (WebElement e : elelist) {
			String list = e.getText();
			System.out.println(list);
		}
	}

	public int getElementscount(By locator) {
		return getElements(locator).size();

	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

//	******************Dropdownutils***************************

	public void doselectdropdownbyindex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}

	public void doselectdropdownbyvalue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}

	public void doselectdropdownbyVisiletext(By locator, String VisibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(VisibleText);
	}

	public void printSelectDropDownValues(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionlist = select.getOptions();

		for (WebElement e : optionlist) {
			String text = e.getText();
			System.out.println(text);

		}

	}

	public List<String> getSelectDropDowngetElementsValuesList(By locator) {

		Select select = new Select(getElement(locator));

		List<String> valuelist = new ArrayList<String>();
		List<WebElement> optionlist = select.getOptions();

		for (WebElement e : optionlist) {
			String text = e.getText();
			valuelist.add(text);

		}
		return valuelist;
	}

	public void selectValuesfromDropDown(By locator, String value) {
		List<WebElement> countryoptions = getElements(locator);
		System.out.println(countryoptions.size());
		for (int i = 0; i < countryoptions.size(); i++) {
			String text = countryoptions.get(i).getText();
			System.out.println(text);

			if (text.contains(value)) {
				countryoptions.get(i).click();
				break;
			}

		}

	}

	public int getSelectDropDownValueCount(By locator) {
		return getElements(locator).size();
	}

	public void selectValuefromSelectDropDown(By locator, String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionlist = select.getOptions();

		for (WebElement e : optionlist) {
			String text = e.getText();

			if (text.contains(value)) {
				e.click();
				break;
			}
		}
	}

}
