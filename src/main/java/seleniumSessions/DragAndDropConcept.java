package seleniumSessions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	public static void main(String[] args) {


		driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions act = new Actions(driver);
		By src = By.id("draggable");
		By tgt = By.id("droppable");
		
//		act.clickAndHold(driver.findElement(src)).moveToElement(driver.findElement(tgt)).release().perform();
		
//		act.dragAndDrop(driver.findElement(src), driver.findElement(tgt)).perform();
	
		doDragAnadDrop(src,tgt);
	}
	
	public static void doDragAnadDrop(By src, By tgt) {
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(src)).moveToElement(driver.findElement(tgt)).release().perform();

	}

}
