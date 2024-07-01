package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		DOM v1
		WebElement email =driver.findElement(By.id("input-email"));
		email.sendKeys("nu@gmail.com");
		driver.navigate().refresh();
		
//		DOM V2
		email =driver.findElement(By.id("input-email"));
		email.sendKeys("sum@gmail.com");
		
//		driver.navigate().refresh();
//		org.openqa.selenium.StaleElementReferenceException: stale element reference: stale element not found
		
	}

}
