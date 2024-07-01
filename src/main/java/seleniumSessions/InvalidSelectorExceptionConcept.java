package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorExceptionConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

//		driver.findElement(By.xpath("//testing[@@'bill']")).click();
//		org.openqa.selenium.JavascriptException: javascript error:

		
//		driver.findElement(By.cssSelector("input//id")).click();
//		 org.openqa.selenium.JavascriptException: javascript error:
		
//		driver.findElement(By.xpath("//input[@id='naveen']")).click();
//		org.openqa.selenium.NoSuchElementException: no such element: 
//		Syntax error Unable to locate element: {"method":"xpath","selector":"//input[@id='naveen']"}
		
//		driver.findElement(By.className("form-control input-lg"));
//		org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
		
		
		
	}

}
