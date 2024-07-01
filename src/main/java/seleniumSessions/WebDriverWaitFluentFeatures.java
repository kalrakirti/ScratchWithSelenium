package seleniumSessions;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitFluentFeatures {

	static WebDriver driver;
	public static void main(String[] args) {
	
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By pricingLink = By.linkText("Pricing");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofSeconds(2));
//		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink));

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(10))
		.ignoring(NoSuchElementException.class)
		.withMessage("--Element not found");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pricingLink)).click();
	}

}
