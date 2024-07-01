package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeValue {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By forgtpwd = By.linkText("Forgotten Password");
		String hrfVal = driver.findElement(forgtpwd).getAttribute("href");
		
		System.out.println(hrfVal);
		
		By email = By.id("input-email");
		driver.findElement(email).sendKeys("kid@test.com");
//		String emailVal = driver.findElement(email).getAttribute("value");
//		System.out.println(emailVal);
//		
		ElementUtil eutil = new ElementUtil(driver);
		String eVal = eutil.doGetAttribute(email, "value");
		System.out.println(eVal);

		
	}

}
