package seleniumSessions;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownGetOptionsWithoutSelect {

	static WebDriver driver;

	public static void main(String[] args) {

//		1) Select a value from dropdown without using select class methods 
//		2) Select a value from dropdown without using select class

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");

		// Assignment 1
//		selectValueFromDropDown(country,"India");

		// Assignment 2
		selectValueFromDropDownWithoutSelectClass(countryOptions,"Canada");
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	// Assign 1 :-
	public static void selectValueFromDropDown(By locator, String optionText) {
		Select select = new Select(getElement(locator));
		List<WebElement> options = select.getOptions();

		for (WebElement e : options) {
			String text = e.getText();
			if (text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}
	}

	public static void selectValueFromDropDownWithoutSelectClass(By locator, String selectText) {

		List<WebElement> countryList = driver.findElements(locator);
		System.out.println(countryList.size());

		for (WebElement e : countryList) {
			String text = e.getText();
			if (text.equals(selectText)) {
				e.click();
			}
		}

	}
}

 
