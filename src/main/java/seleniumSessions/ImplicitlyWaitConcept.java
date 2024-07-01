package seleniumSessions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {

//			Implicitly wait is a global wait so it is applied throughout the script.
//				not work with alerts and urls, title.

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("input-email")).sendKeys("abc");
		driver.findElement(By.id("input-password")).sendKeys("abc");

	}

}
