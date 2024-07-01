package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		

//		1) using id  --unique attribute 
//		driver.findElement(By.id("input-email")).sendKeys("ka@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("Kirti@123");

//		2) name  -- can be duplicate
//		driver.findElement(By.name("email")).sendKeys("abc@test.test");
//		driver.findElement(By.name("password")).sendKeys("abc");
		
//		3) className -- can be duplicate
//		driver.findElement(By.className("form-control")).sendKeys("abc");
		
//		4) xpath -- xpath is not an attribute, Xpath is address of element inside the DOM.
//		driver.findElement(By.xpath("//*[@id=\'input-email\']")).sendKeys("abc");
//		driver.findElement(By.xpath("//*[@id=\'input-password\']")).sendKeys("abc");
//		driver.findElement(By.xpath("//*[@id=\'content\']/div/div[2]/div/form/input")).click();
		
//		5) CSS selector - (Cascade Style Sheet)
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("atve@test.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("abc123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
		
//		6)link text --only for links html tag <a> , Case sensitive
//		driver.findElement(By.linkText("Register")).click();
		
//		7)partialLinkTExt
//		driver.findElement(By.partialLinkText("Gift")).click();
		
//		8)tagName
//		String header =driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
		
		
	}

}
