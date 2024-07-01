package seleniumSessions;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RelativeLocatorWithCheckBox {

	public static void main(String[] args) {
		
//		Selenium 4 has this feature added
		WebDriver driver = new ChromeDriver();
	
//		Usecase 1
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
//		WebElement ele = driver.findElement(By.linkText("Privacy Policy"));
//		
//		driver.findElement(with(By.name("agree")).toRightOf(ele)).click();
//		
//		driver.findElement(with(By.xpath("//input[@value ='Continue']")).toRightOf(ele)).click();

		
//		usecase 2
		
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
		WebElement header = driver.findElement(By.xpath("//h2['New Customer']"));
		WebElement continueB = driver.findElement(By.linkText("Continue"));
		List<WebElement> lis =driver.findElements(with(By.tagName("p")).below(header).above(continueB));
		
		
		for (WebElement e : lis) {
			System.out.println(e.getText());
		}
		
	}

}
