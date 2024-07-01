package seleniumSessions;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionDropdown {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");

//		Select select = new Select(driver.findElement(country));
//
//		List<WebElement> allOptions = select.getOptions();
//		System.out.println(allSelectedOptions.size());
//
//		for (WebElement e : alldOptions) {
//			System.out.println(e.getText());
//		}
		
		List<String> countryList = getDropDownOptions(country);
		System.out.println(countryList);
		
		List<String> empList = getDropDownOptions(employee);
		System.out.println(empList);
		
		System.out.println(getDropdownOptionsCount(employee));
	}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static int getDropdownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return getDropDownOptions(locator).size();
	}

	public static List<String> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();

		for (WebElement e : options) {
			String text = e.getText();
			optionsTextList.add(text);
		}

		return optionsTextList;

	}
}
