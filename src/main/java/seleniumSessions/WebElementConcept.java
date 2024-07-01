package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementUtil util = new ElementUtil(driver);		
		
//		1)
//		driver.findElement(By.id("input-email")).sendKeys("ka@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Kirti@123");
		
//		2)
//		WebElement user =driver.findElement(By.id("input-email"));
//		WebElement pwd =driver.findElement(By.id("input-password"));
//		
//		user.sendKeys("k@test.com");
//		pwd.sendKeys("abc");
		
//		3)Bylocator + Webelement 
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		WebElement a =  driver.findElement(email);
//		WebElement b = driver.findElement(pwd);
//		
//		a.sendKeys("k@test.com");
//		b.sendKeys("123aa");
		
//		4)ByLocator + Generic fxn for WE
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		getElement(email).sendKeys("abc@test");
//		getElement(pwd).sendKeys("abc123");
		
//		5)By locator + generic fxn
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		doSendKeys(email,"abc@test.com");
//		doSendKeys(pwd,"abc");
		 
		
//		6) By locator + generic function and send keys : elementUtil
//		By email = By.id("input-email");
//		By pwd = By.id("input-password");
//		
//		util.doSendKeys(email,"abc@test.com");
//		util.doSendKeys(pwd,"abc");
		
//		7)
		
	}
	public static WebElement getElement(By loc) {
		return driver.findElement(loc);
	}

	public static void doSendKeys(By locate, String key) {
		getElement(locate).sendKeys(key);
	}
	
}
