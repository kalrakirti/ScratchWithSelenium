package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
//		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

		Thread.sleep(3000);
		By content = By.cssSelector(".menulink");
		By courses = By.linkText("COURSES");

//		Actions act = new Actions(driver);
//
//		act.moveToElement(driver.findElement(content)).perform();
//		driver.findElement(courses).click();
		
//		selectSubMenues(content,courses);

		
		driver.get("https://www.spicejet.com/");
		By addOn = By.xpath("//div[text()='Add-ons']");
		By visaServices = By.xpath("//div[text()='Visa Services']");
		selectSubMenues(addOn,visaServices);
	}

	
	public static void selectSubMenues(By parent, By subMenue) throws InterruptedException {

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(parent)).perform();
		Thread.sleep(2000);
		driver.findElement(subMenue).click();

	}
}
