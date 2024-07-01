package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		BrowserUtil brutil = new BrowserUtil();
		
		WebDriver dr =brutil.launchBrowser("chrome");
		brutil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brutil.getPageTitle());
		System.out.println(brutil.getPageCurrentUrl());
		
		By email = By.id("input-email");
		By pwd = By.id("input-password");
		
		ElementUtil eUtil =new ElementUtil(driver);
		eUtil.doSendKeys(email,"abc@test.com");
		eUtil.doSendKeys(pwd,"abc123");
		
		brutil.closeBrowser();
		
		 
	}

}
