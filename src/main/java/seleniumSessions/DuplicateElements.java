package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateElements {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
//		driver.findElement(By.linkText("Forgotten Password")).click();
		
		By forgotPwd= By.linkText("Forgotten Password");
		By loginLink = By.linkText("Login");
		doClick(forgotPwd);
		doClick(loginLink);
		

	}
	public static WebElement getElement(By loc) {
		return driver.findElement(loc);
	}
	
	public static  void doClick(By locator) {
	 getElement(locator).click();	
	}

}
