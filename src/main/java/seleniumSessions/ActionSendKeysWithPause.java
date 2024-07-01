package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeysWithPause {

	static WebDriver driver ;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.get("https://naveenautomationlabs.com/opencart/");
//		By searchBox = By.xpath("//input[@placeholder='Search']");
		By search = By.name("search");
		String sendKey ="MacBook";
		char ch[] = sendKey.toCharArray();

		
		for(char c : ch) {
		act.sendKeys(driver.findElement(search),String.valueOf(c)).pause(500).perform();
//		act.sendKeys(driver.findElement(search),c+"");
		}
		
		
	}
	
	public static void doSendKeysWithAct(By locator, String value, long pauseTime) {

		Actions act = new Actions(driver);
		char ch[] = value.toCharArray();

		for (char c : ch) {
			act.sendKeys(driver.findElement(locator), String.valueOf(c)).pause(pauseTime).perform();
//		act.sendKeys(driver.findElement(search),c+"");

		}

	}
}
