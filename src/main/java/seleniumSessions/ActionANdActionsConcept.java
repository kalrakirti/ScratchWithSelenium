package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionANdActionsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
//.build method return Action refrence .
		
		driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.get("https://naveenautomationlabs.com/opencart/");
//		
		By search = By.name("search");
		String sendKey ="MacBook";
		
		
		Action action = act.sendKeys(driver.findElement(search),"abc").build();
		action.perform();
	}

}
