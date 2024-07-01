package seleniumSessions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

//		Wait (I) --> Until()
//			implemented by 	FluentWait(C) - method(){}
//				extended by WebDriverWait(C)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By email = By.id("input-email");
		By pwd = By.id("input-password");
		By login = By.xpath("//input[@value='Login']");

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));// sel 4
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(email));
//		email_ele.sendKeys("abc@system.com");
//		getElement(pwd).sendKeys("ab@123");
//		getElement(login).click();

		waitForElementPresent(email, 10).sendKeys("abc@test.com");
		waitForElementPresent(pwd, 10).sendKeys("abx@123");
		getElement(login).click();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does notnecessarily mean that the element is visible
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));// sel 4
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));

	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that isgreater than 0. *
	 * 
	 * @param locator
	 * @param timeout
	 * @return
	 */
	public static WebElement waitForElementVisible(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));// sel 4
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

	}

}