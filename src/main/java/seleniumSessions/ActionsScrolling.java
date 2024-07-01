package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Actions act = new Actions(driver);
		
		
//		1. partially scroll
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		act.sendKeys(Keys.PAGE_UP).perform();

//		2 ctr + up/Down arrow
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
//		Thread.sleep(2000);
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		
		
//		3 Scroll to element
		
//		act.scrollToElement(driver.findElement(By.linkText("Help"))).click(driver.findElement(By.linkText("Help"))).perform();
//		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	}

}
