package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptException {
	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		try {
//		//NoSuchElementException
//		driver.findElement(By.id("input-email11")).sendKeys("abc@test.com");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		driver.findElement(By.id("input-password")).sendKeys(null);
	
	}

}
