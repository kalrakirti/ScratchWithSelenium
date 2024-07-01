package seleniumSessions;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForMultipleElements {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		By toplink = By.cssSelector("div#navbar-collapse a");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//An expectation for checking that there is at least one element present on a web page.
		List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(toplink));
		
		System.out.println(list.size());

		for (WebElement e : list) {
			System.out.println(e.getText());
		}
	}

	/**
	 * 
	 * 
	 * An expectation for checking that there is at least one element present on a
	 * web page.
	 * 
	 * @param timeOut
	 * @param locator
	 * @return
	 */
	public static List<WebElement> waitForAllElementsPresent(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		// An expectation for checking that there is at least one element present on a
		// web page.
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));

	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locatorare visible. Visibility means that the elements are not only
	 * displayed but also have a heightand width that is greater than 0.
	 * 
	 * @param timeOut
	 * @param locator
	 * @return
	 */

	public static List<WebElement> waitForAllElementsVisible(int timeOut, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		// An expectation for checking that there is at least one element present on a
		// web page.
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

	}
}
