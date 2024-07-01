package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action4LevelMenueHandlingBigBasket {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");

		By level1 = By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		By level2 = By.linkText("Beverages");
		By level3 = By.linkText("Coffee");
		By level4 = By.linkText("Instant Coffee");

//		driver.findElement(level1).click();
//		Actions act = new Actions(driver);
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(level2)).perform();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(level3)).perform();
//		Thread.sleep(2000);
//		driver.findElement(level4).click();
//	
//		level4MenuSubmenuHandling(level1, level2, level3, level4);
		level4MenuSubmenuHandlingusingMouseHover(level1,"Bakery, Cakes & Dairy","Dairy","Cheese");

	}

	public static void level4MenuSubmenuHandling(By level1, By level2, By level3, By level4)
			throws InterruptedException {

		driver.findElement(level1).click();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level2)).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level3)).perform();
		Thread.sleep(2000);
		driver.findElement(level4).click();
	}

	public static void level4MenuSubmenuHandlingusingMouseHover(By level1, By level2, By level3, By level4)
			throws InterruptedException {

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(level1)).perform();
		Thread.sleep(2000);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level2)).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(level3)).perform();
		Thread.sleep(2000);
		driver.findElement(level4).click();
	}

	public static void level4MenuSubmenuHandlingusingMouseHover(By level1, String level2, String level3, String level4)
			throws InterruptedException {

		driver.findElement(level1).click();
		Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(level1)).perform();
		Thread.sleep(2000);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText(level2))).perform();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText(level3))).perform();
		Thread.sleep(2000);
		driver.findElement((By.linkText(level4))).click();
	}
}
