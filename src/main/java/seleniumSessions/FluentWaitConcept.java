package seleniumSessions;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
	
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By pricingLink = By.linkText("Pricing");
		waitForElementVisibility(10,2,pricingLink).click();
		
	}
		
		public static WebElement waitForElementVisibility( int timeOut,int pollingTime,By locator) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))   // default polling time
					.ignoring(NoSuchElementException.class)
					.ignoring(StaleElementReferenceException.class)
					.withMessage("--element not found--");

			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
	
		public static WebElement waitForElementPresence( int timeOut,int pollingTime,By locator) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(pollingTime))   // default polling time
					.ignoring(NoSuchElementException.class)
					.withMessage("--element not found--");

			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		}
	}


