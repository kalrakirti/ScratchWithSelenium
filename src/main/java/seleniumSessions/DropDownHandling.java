package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");

		Select select_country = new Select(driver.findElement(country));
//		select_country.selectByIndex(2);

//		select_country.selectByVisibleText("Belgium");

		// recomended
//		select_country.selectByValue("Bangladesh");

//		select_country.selectByValue("Naveen");// org.openqa.selenium.NoSuchElementException

//		Select select_employee = new Select(driver.findElement(employee));
//		select_employee.selectByVisibleText("101-150");
		
		doSelectByText(country,"Bangladesh");

	}

	public static void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}
	
	public static void doSelectByVisibleText(By locator,String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static void doSelectByText(By locator,String Text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(Text);
	}
	
	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}
}
