package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v121.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class ActionsWithMethodChaining {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
//		Q:- Without using any By locator (one allowed) need to fill the value in form till last field.
		
		driver =new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By firstName = By.id("input-firstname");
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.sendKeys(driver.findElement(firstName),"Kirou")
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("Ki")
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("kikiKuku@gmail.com")
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("2341231234")
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("pass123")
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys("pass123")
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.TAB)
		.pause(500)
		.sendKeys(Keys.SPACE)
		.pause(500)
		.sendKeys(Keys.ENTER)
		.perform();
	}

}
