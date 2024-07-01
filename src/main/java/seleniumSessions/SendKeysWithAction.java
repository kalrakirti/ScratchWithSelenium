package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithAction {

	static WebDriver driver ;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.get("https://naveenautomationlabs.com/opencart/");
		By searchBox = By.xpath("//input[@placeholder='Search']");
		
//		act.sendKeys(driver.findElement(searchBox), "ABC").perform();
//		act.click(driver.findElement(By.linkText("Forgottten Password"))).perform();
		
		
		
		
	
	}

}
